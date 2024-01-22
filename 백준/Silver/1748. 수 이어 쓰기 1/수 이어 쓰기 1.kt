import java.math.BigInteger
import kotlin.math.pow

fun main() {
    //120일때 -> 1 ~ 9 + 10 ~ 99 + 100 ~ 120
    val input = readln().toBigInteger()
    var answer = BigInteger.ZERO

    if (input.toString().length == 1) {
        println(input)
    } else {
        //input.toString().length는 길이 3,, i = 0,1,2
        for (i in 1 until input.toString().length) {
            answer += (9 * i * 10.0.pow(i-1).toInt()).toString().toBigInteger()
        }
        val temp = (input - (10.0.pow(input.toString().length - 1).toInt()).toBigInteger() + BigInteger.ONE) * input.toString().length.toBigInteger()
        print(answer+temp)
    }

}