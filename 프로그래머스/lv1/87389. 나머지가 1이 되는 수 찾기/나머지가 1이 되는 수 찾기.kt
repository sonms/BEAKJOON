class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val arr = arrayListOf<Int>()
        
        for (i in 1..n) {
            if (n % i == 1) {
                arr.add(i)
            }
        }
        answer = arr[0]
        
        return answer
    }
}