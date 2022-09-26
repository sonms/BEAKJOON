class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        var h = 0
        val temp = citations.sorted()
        
        for(i in temp.indices) {
            h = temp.size-i
            
            if(temp[i] >= h) {
                answer = h
                break//h의 최댓값이니 조건에 충족하자마자 그만두어야 i의값이 제일 작아 최대가 된다.
            }
        }
        
        return answer
    }
}