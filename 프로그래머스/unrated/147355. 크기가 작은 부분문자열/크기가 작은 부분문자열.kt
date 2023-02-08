class Solution {
    fun solution(t: String, p: String): Int {
        val answerArr = arrayListOf<Long>()
        val tempArr = arrayListOf<String>()
        val pi = p.toLong()
        for (i in t.indices) {
            if (i + p.length > t.length) {
                
            } else {
                val ts = t.slice(i until i + p.length)
                if (ts.toLong() <= pi) {
                    answerArr.add(ts.toLong())
                }
            }
        }
        /*val an = tempArr.filter {it.toInt() <= p.toInt()}
        for (j in an.indices) {
            answerArr.add(an[j].toInt())
        }*/
    
        return answerArr.size
    }
}