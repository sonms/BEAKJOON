fun arithmeticSequence(n : Int) : Int {
    var cnt = 0
    if (n < 100) {
        return n
    } else {
        cnt = 99
        for (i in 100..n) {
            val hun = i / 100
            val ten = (i / 10) % 10
            val one = i % 10
            if ((hun-ten) == (ten-one)) {
                cnt++
            }
        }
    }
    return cnt
}
fun main() {
    val input = readLine()!!.toInt()
    val result = arithmeticSequence(input)
    print(result)
}