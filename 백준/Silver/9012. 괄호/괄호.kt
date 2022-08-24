fun stackArr(s : String):String {
    var staArr = arrayListOf<Char>()
    for (j in s.indices) {
        val c = s[j]
        if (c == '(') {
            staArr.add(c) //push
        } else if(staArr.isEmpty()) {
            //스택이 빈 경우, 즉, 닫는 괄호를 입력받았으나 pop할 원소가 없는 경우
            return "NO"
        } else {
            staArr.removeAt(staArr.size-1)
        }
    }
    if (staArr.isEmpty()) {
        return "YES"
    } else {
        return "NO"
    }
}

fun main() {
    val input = readLine()!!.toInt()
    var re_arr = arrayListOf<String>()

    for(i in 0 until input) {
        val s = readLine()!!.toString()
        re_arr.add(stackArr(s))
    }

    re_arr.forEach {
        println(it)
    }
}