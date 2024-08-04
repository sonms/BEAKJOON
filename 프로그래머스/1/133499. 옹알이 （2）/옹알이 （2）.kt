class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val temp = mutableListOf<String>()
        temp.addAll(babbling)
        for (i in temp.indices) {
            if (temp[i].contains("ayaaya") || temp[i].contains("yeye") || temp[i]
                    .contains("woowoo") || temp[i].contains("mama")
            ) {
                continue
            }
            temp[i] = temp[i].replace("aya", " ")
            temp[i] = temp[i].replace("ye", " ")
            temp[i] = temp[i].replace("woo", " ")
            temp[i] = temp[i].replace("ma", " ")
            temp[i] = temp[i].replace(" ", "")
            if (temp[i].isEmpty()) answer++
        }
        
        
        return answer
    }
}