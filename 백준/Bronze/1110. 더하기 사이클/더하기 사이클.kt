fun main() {
    val input = readln().toString()
    var cnt = 0
    var newNum = "-1"
    var temp = if (input.toInt() < 10) {
        "0$input"
    } else {
        input
    }
    while (newNum != input) {
        val t = (temp[0].toString().toInt() + temp[1].toString().toInt()).toString()
        newNum = (temp[1].toString() + t.last().toString()).toInt().toString()
        cnt++

        temp = if (newNum.toInt() < 10) {
            "0$newNum"
        } else {
            newNum
        }
    }
    println(cnt)
}