class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        
        var alpha = "abcdefghijklmnopqrstuvwxyz"
        for (j in skip) {
            alpha = alpha.replace(j.toString(), "")
        }

        for (i in s) {
            var pos = if (alpha.indexOf(i) < 0) {
                0 + index
            } else {
                alpha.indexOf(i) + index
            }

            while (true) {
                //println("?")
                if (pos >= alpha.length) {
                    pos -= alpha.length
                } else {
                    break
                }
            }
            //println("pos2 " + pos)
            answer += alpha[pos]
        }   
    
        return answer
    }
}