import java.math.BigInteger

fun main() {
    val input = readln()

    val start = input.split(" ").first().toBigInteger()
    val end = input.split(" ").last().toBigInteger()

    //두 정수 사이 합 공식
    val a = (((end - start + BigInteger.ONE) * (start + end)) / "2".toBigInteger()) % "9".toBigInteger()

    println(a)
}