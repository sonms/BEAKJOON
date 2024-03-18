import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import kotlin.math.pow
/*
fun change(b: Int, d: String): String {
    var sum = BigInteger.ZERO // sum을 BigInteger로 초기화


}*/

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n) {
        val (b, d) = br.readLine().split(" ")

        /*if (b.toInt() == 10) {
            bw.write(d.toBigInteger().mod(BigInteger(b) - BigInteger.ONE).toString())
            bw.newLine()
        } else {

        }*/

        //모든 자리 숫자를 더한 후 mod b-1을 하면 그게 나머지다
        //ex 123456 7진 mod 6 => 1*7^5 + ... + 6 * 7^0인데 모든 자리수를 mod하면 결국 1+2+3+4+5+6인 자릿수의 수만 남음

        val result = d.sumOf { it.toString().toInt() }.mod(b.toInt()-1)

        bw.write(result.toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}