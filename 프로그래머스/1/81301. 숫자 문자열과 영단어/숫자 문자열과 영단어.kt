class Solution {
    fun solution(s: String): Int {
        var temp = s
        var answer: Int = 0
        val numList = listOf<String>(
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine")
        
        for (i in numList) {
            if (temp.contains(i)) {
                temp = temp.replace(i, numList.indexOf(i).toString())
            }
        }
        answer = temp.toInt() 
        return answer
    }
}