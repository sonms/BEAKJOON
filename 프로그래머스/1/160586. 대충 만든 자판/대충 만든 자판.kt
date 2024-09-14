class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in targets) {
        var allClick = 0
        for (c in i) {
            var cnt = Int.MAX_VALUE
            //println(c)
            for (k in keymap.indices) { //ABACD, BCEFD
                //cnt = min(keymap[k].indexOf(it), cnt)
                if (cnt > keymap[k].indexOf(c) && keymap[k].contains(c)) {
                    cnt = keymap[k].indexOf(c) + 1
                } else if (!keymap[k].contains(c) && k == keymap.size-1 && cnt == Int.MAX_VALUE) {
                    cnt = -1
                    break
                }
                //println("${keymap[k].indexOf(it)} keymap")
                /*println(cnt)
                println(keymap[k])*/
            }
            if (cnt != -1) {
                allClick += cnt
            } else {
                allClick = -1
                break
            }
            //println("cnt $cnt")
        }
        answer = answer.plus(allClick)
    }
        return answer
    }
}