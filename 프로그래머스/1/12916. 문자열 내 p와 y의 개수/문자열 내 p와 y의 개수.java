class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String input = s.toLowerCase();
        long inputPCnt = input.chars().filter(c -> c == 'p').count();
        long inputYCnt = input.chars().filter(c -> c == 'y').count();

        answer = inputPCnt == inputYCnt;

        return answer;
    }
}