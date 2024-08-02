class Solution {
    fun solution(s: String) : ArrayList<Int> {
        val answer = ArrayList<Int>()
        val indexHm = HashMap<Char, Int>() //b,인덱스
        val input = s

        for (i in input.indices) {
        
            if (indexHm.containsKey(input[i])) {
                val before = indexHm[input[i]]
                val after = i - before?.toInt()!!
                answer.add(after)
                indexHm[input[i]] = i
            } else {
                indexHm[input[i]] = i
                answer.add(-1)
            }
        }
        return answer
    }
}