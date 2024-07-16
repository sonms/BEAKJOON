import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max
import kotlin.math.min

fun gcd(a : Int, b : Int) : Int{
    if (b == 0) return a
    return gcd(b, a % b)
}

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))
    var answerA = 0
    var answerB = 0

    var (firstA, firstB) = br.readLine().split(" ").map { it.toInt() }
    var (secondA, secondB) = br.readLine().split(" ").map { it.toInt() }

    val fN = gcd(firstA, firstB)
    val sN = gcd(secondA, secondB)
    firstA /= fN
    firstB /= fN
    secondA /= sN
    secondB /= sN

    if (firstB == secondB) {
        answerA = firstA + secondA
        answerB = firstB
        val aN = gcd(answerA, answerB)
        answerA /= aN
        answerB /= aN
        println("$answerA $answerB")
    } else {
        val n = gcd(firstB, secondB)
        val lcm = (firstB / n) * (secondB/n) * n

        firstA *= (lcm / firstB)
        secondA *= (lcm / secondB)
        answerA = firstA + secondA
        answerB = lcm
        val aN = gcd(answerA, answerB)
        answerA /= aN
        answerB /= aN
        println("$answerA $answerB")
    }

}