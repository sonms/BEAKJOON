class Solution {
    fun solution(numbers: IntArray): Int {
        val temp = mutableListOf(0,1,2,3,4,5,6,7,8,9)
        
        for (i in numbers.indices) {
            if (temp.contains(numbers[i])) {
                temp.remove(numbers[i])
            }
        }
        
        return temp.sum()
    }
}