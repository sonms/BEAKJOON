class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var arr = IntArray(n+1) {0} 
        arr[0] = 0
        arr[1] = 1
        
        for (i in 2..n) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567 
        }
        answer = arr[n]
        return answer
    }
}