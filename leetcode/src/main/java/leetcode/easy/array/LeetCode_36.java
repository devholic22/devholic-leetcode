package leetcode.easy.array;

public class LeetCode_36 {

    /**
     * SOLVED: 23.12.03
     * https://leetcode.com/problems/valid-sudoku/
     */
    public boolean isValidSudoku(char[][] board) {
        // char 형이기 때문에 int로 변환하는 데 살짝 번거로웠다.
        // 행 별 검사 (각 행에 있는 숫자들이 독립적인가?)
        for (int row = 0; row < 9; row++) {
            boolean[] visited = new boolean[9 + 1];
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                if (visited[Integer.parseInt(String.valueOf(board[row][col]))]) {
                    return false;
                }
                visited[Integer.parseInt(String.valueOf(board[row][col]))] = true;
            }
        }
        // 열 별 검사 (각 열에 있는 숫자들이 독립적인가?)
        for (int col = 0; col < 9; col++) {
            boolean[] visited = new boolean[9 + 1];
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') {
                    continue;
                }
                if (visited[Integer.parseInt(String.valueOf(board[row][col]))]) {
                    return false;
                }
                visited[Integer.parseInt(String.valueOf(board[row][col]))] = true;
            }
        }
        // 3x3 별 검사 (각 상자 안에 있는 숫자들이 독립적인가?)
        // 이 과정이 살짝 복잡했다. 4중 for문을 써야 한다. 그래도 개수가 제한되어 있어서 복잡도는 낮다.
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] visited = new boolean[9 + 1];
                for (int subRow = row; subRow < row + 3; subRow++) {
                    for (int subCol = col; subCol < col + 3; subCol++) {
                        if (board[subRow][subCol] == '.') {
                            continue;
                        }
                        if (visited[Integer.parseInt(String.valueOf(board[subRow][subCol]))]) {
                            return false;
                        }
                        visited[Integer.parseInt(String.valueOf(board[subRow][subCol]))] = true;
                    }
                }
            }
        }
        return true; // 모두 통과했다면 valid
    }
}
