import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      
        Stack<Integer> answer = new Stack<>();


        for (int i=0; i<arr.length; i++) {
            if (answer.isEmpty() || !Objects.equals(answer.peek(), arr[i])) {
                answer.push(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}