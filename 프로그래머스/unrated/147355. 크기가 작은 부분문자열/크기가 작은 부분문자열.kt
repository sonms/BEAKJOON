class Solution {
    fun solution(t: String, p: String): Int {
        val answerArr = arrayListOf<Long>()
        val tempArr = arrayListOf<String>()
        val pi = p.toLong()
        for (i in t.indices) {
            if (i + p.length <= t.length) {
                val ts = t.slice(i until i + p.length)
                if (ts.toLong() <= pi) {
                    answerArr.add(ts.toLong())
                }
                //tempArr.add(ts)
            }
        }
        /*val an = tempArr.filter {it.toLong() <= p.toLong()}
        for (j in an.indices) {
            answerArr.add(an[j].toLong())
        }*/
    
        return answerArr.size
    }
}