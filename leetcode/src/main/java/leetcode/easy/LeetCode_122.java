package leetcode.easy;

public class LeetCode_122 {

    /**
     * SOLVED: 23.11.28
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     */
    public int maxProfit(int[] prices) {
        int profit = 0; // 금액
        int buyPrice = Integer.MIN_VALUE; // 사고자 하는 금액 (숫자 목록에 0이 들어올 수 있으므로 MIN_VALUE)
        int sellPrice = Integer.MIN_VALUE; // 팔고자 하는 금액 (숫자 목록에 0이 들어올 수 있으므로 MIN_VALUE)

        for (int i = 0; i < prices.length - 1; i++) {
            // 만약 이전 금액이 이후 금액보다 크다면 [7, 1]의 경우처럼 무시되는 경우임
            if (prices[i] > prices[i + 1]) {
                profit += (sellPrice - buyPrice); // 현재까지 저장된 금액들을 이용해 수익을 더함
                sellPrice = Integer.MIN_VALUE; // 사고자 하는 금액 초기화
                buyPrice = Integer.MIN_VALUE; // 팔고자 하는 금액 초기화
                continue; // i번째는 건너뛰어야 함
            }
            // 만약 사고자 하는 금액이 초기화 값이라면 - 정해지지 않은 것임. buyPrice와 sellPrice를 정함.
            if (buyPrice == Integer.MIN_VALUE) {
                buyPrice = prices[i];
                sellPrice = prices[i + 1];
            }
            // 만약 기존에 저장된 sellPrice보다 새로운 sellPrice가 더 높다면 갱신함
            if (prices[i + 1] > sellPrice) {
                sellPrice = prices[i + 1];
            }
        }
        // 맨 마지막 값이 가장 큰 값이 아니었다면 sellPrice와 buyPrice가 모두 0이지만, 만약 가장 큰 값이었다면 더하지 못했으므로 더해줌
        profit += (sellPrice - buyPrice);
        return profit;
    }
}
