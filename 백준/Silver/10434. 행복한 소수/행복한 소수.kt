import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.sqrt

fun isPrime(n : Int) : Boolean {
    val temp = sqrt(n.toDouble())
    if (n <= 1) return false
    for (i in 2..temp.toInt()) {
        if (n % i == 0) {
            return false
        }
    }
    return true
    //return (2..Math.sqrt(num.toDouble()).toInt()).none { num % it == 0 }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    //val checkCycle = BooleanArray(10001){false}
    repeat(n) {
        val temp = br.readLine().split(" ").map { it.toInt() }
        val tc = temp[0]
        val num = temp[1]
        val checkCycle = BooleanArray(10001){false}
        if (isPrime(num)) {
            var sum = num
            //println(sum)
            /*for (i in 0..100) {
                for (j in sum.toString()) {
                    //println(i.toString().toDouble().pow(2).toInt())
                    sum += j.toString().toDouble().pow(2).toInt()
                    println(j)
                }
                if (sum == 1) {
                    break
                }
            }*/
            while (true) {
                /*for (i in sum.toString()) {
                    sum += i.toString().toDouble().pow(2).toInt()
                    if (checkCycle[sum]) {
                        break
                    } else {
                        checkCycle[sum] = true
                    }
                }*/

                /*sum.toString().forEach {
                    val digit = Character.getNumericValue(it)
                    tempSum += digit * digit
                    //println(tempSum)
                }*/
                var tempSum = 0
                for (i in sum.toString()) {
                    tempSum += i.toString().toDouble().pow(2).toInt()
                    //println(tempSum)
                    //tempSum += i.toString().toDouble().pow(2).toInt()
                }
                sum = tempSum
                if (checkCycle[tempSum]) {
                    //val primeIndices = primes.indices.filter { primes[it] }
                    break
                } else {
                    checkCycle[tempSum] = true
                }

                if (sum == 1) {
                    break
                }
            }
            if (sum == 1) {
                sb.append("$tc $num YES\n")
            } else {
                sb.append("$tc $num NO\n")
            }
        } else {
            sb.append("$tc $num NO\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}