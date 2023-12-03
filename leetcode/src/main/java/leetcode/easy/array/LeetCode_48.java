package leetcode.easy.array;

public class LeetCode_48 {

    /**
     * SOLVED: 23.12.03
     * https://leetcode.com/problems/rotate-image/
     */
    public void rotate(int[][] matrix) {
        // (y1, x1) -> (y2, x2), n x n일 때
            // x1 = y2이다.
            // y1 + x2 = n - 1이다.
        // 그런데 코드로 옮길 때는 matrix[row][col] = origin[(n - col) - 1][row]와 같은 형태로 써야 한다.
        int n = matrix.length;
        int[][] origin = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                origin[row][col] = matrix[row][col];
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = origin[(n - col) - 1][row];
            }
        }

        // 그리고 이런 문제는 조건에서 "DO NOT allocate another 2D matrix and do the rotation."라고 나와 있으며 그렇기에 void로 되어 있지만,
        // 원본을 저장해두는 임시 배열을 만드는 것은 제한이 없다는 것을 이해해야 한다.
    }
}
