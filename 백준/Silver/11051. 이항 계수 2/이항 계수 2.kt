import java.math.BigInteger

fun multiply(a: Int) : BigInteger {
    var i = a.toBigInteger()
    var mul = "1".toBigInteger()
    while (i > BigInteger.ZERO) {
        mul *= i
        i--
    }
    return mul
}
fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val k = input[1].toInt()
    val result = (multiply(n) / (multiply(n-k) * multiply(k))).mod("10007".toBigInteger())
    println(result)
}