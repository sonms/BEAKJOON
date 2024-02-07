import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

fun main() {
    val c = readln().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(c) {
        val tc = readln().split(" ").map { it.toInt() }.toMutableList()
        tc.removeFirst()
        val average = tc.sum() / tc.size
        val answerStudent = tc.filter { it > average }.size

        //println(answerStudent.toBigDecimal().divide(tc.size.toBigDecimal(), 5, RoundingMode.HALF_UP).toString().toDouble())
        val percent = ((answerStudent.toDouble() / tc.size) * 100).toBigDecimal().setScale(3, RoundingMode.HALF_UP)
        /*val average = tc.sum().toBigDecimal().divide(tc.size.toBigDecimal()).setScale(3,RoundingMode.HALF_UP).toString()
        bw.write("$average%")
        bw.newLine()*/
        bw.write("$percent%")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}