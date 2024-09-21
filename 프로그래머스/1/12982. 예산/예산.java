import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int j : d) {
            if (budget-j >=0) {
                answer += 1;
                budget -= j;
            }
        }
        
        return answer;
    }
}