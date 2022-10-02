import java.util.*

class Solution {
    fun Branket(q : Queue<String>) : Int {
        var answer = 0
        val staArr = arrayListOf<String>()
        for (k in q.indices) {
            val t = q.elementAt(k)
            if (t == "(" || t == "{" || t == "[") {
                staArr.add(t)
            } else {
                if (staArr.isEmpty()) { return 0 }
                if (t == ")" && staArr[staArr.size-1] == "(") {
                    staArr.removeAt(staArr.size-1)
                } else if (t == "}" && staArr[staArr.size-1] == "{") {
                    staArr.removeAt(staArr.size-1)
                } else if (t == "]" && staArr[staArr.size-1] == "[") {
                    staArr.removeAt(staArr.size-1)
                }
            }
        }

        if (staArr.isEmpty()) {
            answer += 1
        }

        return answer
    }
    
    fun solution(s: String): Int {
        val q : Queue<String> = LinkedList()
        var answer: Int = 0
        
        for (i in s.indices) {
            q.offer(s[i].toString())
        }
        
        for (j in q.indices) {
            answer += if (j == 0) {
                Branket(q)
            } else {
                val temp = q.poll()
                q.offer(temp)
                Branket(q)
            }
        }
        return answer
    }
}