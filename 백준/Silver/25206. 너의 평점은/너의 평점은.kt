import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val hashMap = HashMap<String, BigDecimal>()

    hashMap["A+"] = 4.5.toBigDecimal()
    hashMap["A0"] = 4.0.toBigDecimal()
    hashMap["B+"] = 3.5.toBigDecimal()
    hashMap["B0"] = 3.0.toBigDecimal()
    hashMap["C+"] = 2.5.toBigDecimal()
    hashMap["C0"] = 2.0.toBigDecimal()
    hashMap["D+"] = 1.5.toBigDecimal()
    hashMap["D0"] = 1.0.toBigDecimal()
    hashMap["F"] = 0.0.toBigDecimal()

    var gradesAndSubjectAverageSum = 0.0.toBigDecimal() //학점 x 과목평균
    var gradesSum = 0.0.toBigDecimal() //학점의합

    repeat(20) {
        val temp = br.readLine().split(" ").map { it.toString() }
        if (temp[2] != "P") {
            gradesSum += temp[1].toBigDecimal()
            gradesAndSubjectAverageSum +=temp[1].toBigDecimal() * hashMap[temp[2]].toString().toBigDecimal()
        }
        //gradesAndSubjectAverageSum += temp[1].toBigDecimal() * hashMap[temp[2]].toString().toBigDecimal()
    }
    val answer = gradesAndSubjectAverageSum.divide(gradesSum, 6, RoundingMode.HALF_UP)
    println(answer)
}