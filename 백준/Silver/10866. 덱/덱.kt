fun checkNum(s : String) : Boolean {
    val temp = s.replace("\\D".toRegex(),"")
    // \\D는 [^0-9] 즉 0~9의 숫자가 아닌 문자열을 의미
    // 따라서 숫자가 아닌 문자들을 공백으로 변경하라는 의미
    var result = true
    if (temp.isEmpty()) {
        result = false
    }
    return result
}
fun main() {
    var sb = StringBuilder()
    val q = ArrayDeque<Int>()
    var re_arr = arrayListOf<Int>()
    val input = readLine()!!.toInt()
    for (i in 1..input) {
        val k = readLine()!!.toString()
        if (checkNum(k)) {
            val ks = k.split(" ")
            val f = ks[0]
            val s = ks[1].toInt()
            if (f == "push_back") {
                q.addLast(s)
            } else if (f == "push_front") {
                q.addFirst(s)
            }
        } else {
            if (k == "front") {
                if (q.isEmpty()) {
                    re_arr.add(-1)
                } else {
                    re_arr.add(q.first())
                }
            }
            if (k == "back") {
                if (q.isEmpty()) {
                    re_arr.add(-1)
                } else {
                    re_arr.add(q.last())
                }
            }
            if (k == "size") {
                re_arr.add(q.size)
            }
            if (k == "empty") {
                if (q.isEmpty()) {
                    re_arr.add(1)
                } else {
                    re_arr.add(0)
                }
            }
            if (k == "pop_front") {
                if (q.isEmpty()) {
                    re_arr.add(-1)
                } else {
                    re_arr.add(q.removeFirst())
                }
            }
            if (k == "pop_back") {
                if (q.isEmpty()) {
                    re_arr.add(-1)
                } else {
                    re_arr.add(q.removeLast())
                }
            }
        }
    }
    re_arr.forEach {
        sb.append(it).append("\n")
    }
    print(sb)
}