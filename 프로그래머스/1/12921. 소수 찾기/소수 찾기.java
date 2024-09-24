import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    static boolean[] isPrime;
    static ArrayList<Integer> prime_numbers = new ArrayList<>();
    static void funPrime(int n) {
        isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (!isPrime[i]) {
                continue;
            }
            for(int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                prime_numbers.add(i);
            }
        }
    }
    public int solution(int n) {
        int answer = 0;
        funPrime(n);
        answer = prime_numbers.size();
        return answer;
    }
}