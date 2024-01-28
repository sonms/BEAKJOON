fun main() {
    val input = readln().toInt()
    var cnt = 0
    var newNum = input
    var sum = 0

    while (true) { //26
        val a = newNum / 10 // 2
        var b = newNum % 10 // 6
        sum = a+b
        b *= 10

        newNum = b+sum%10 // 6 sum%10 = 8%10 = 8 6+8 = 14 바로 다음행
        cnt++

        if (newNum == input) {
            break
        }
    }
    print(cnt)
}

/*
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
}*/
