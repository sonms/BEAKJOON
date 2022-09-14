class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        
        var arr = LongArray(2001) {0}
        
        arr[1] = 1
        arr[2] = 2
        
        for(i in 3..2000) {
            arr[i] = (arr[i-2] + arr[i-1])%1234567
            
        }
        
        return arr[n]
    }
}