import java.util.Arrays;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (Arrays.stream(bill).min().getAsInt() > Arrays.stream(wallet).min().getAsInt()
            || Arrays.stream(bill).max().getAsInt() > Arrays.stream(wallet).max().getAsInt()) {
            if (bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1]/2;
            }
            answer += 1;
        }
        return answer;
    }
}