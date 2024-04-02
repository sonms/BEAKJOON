import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    val temp = sqrt(n.toDouble())
    if (n <= 1) return false
    for (i in 2..temp.toInt()) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val n = br.readLine().toInt()

    repeat(n) {
        var ans: Int? = null
        var ans2 = ""
        val input = br.readLine().split(" ").map { it.toInt() }.drop(1).toList()

        for (i in 2..input.size) { // 연속해서 더할 개수
            val windowSum = IntArray(input.size + 1)
            for (j in input.indices) {
                windowSum[j + 1] = windowSum[j] + input[j]
            }

            var breakFlag = false
            for (j in 0..input.size - i) {
                val sum = windowSum[j + i] - windowSum[j]
                if (isPrime(sum) && sum >= 2) {
                    ans = i
                    ans2 = input.subList(j, j + i).joinToString(" ")
                    breakFlag = true
                    break
                }
            }

            if (breakFlag) {
                break
            }
        }

        if (ans == null) {
            sb.append("This sequence is anti-primed.\n")
        } else {
            sb.append("Shortest primed subsequence is length $ans: $ans2\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

/*
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
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

    repeat(n) {
        var ans : Int? = null
        var ans2 = ""
        var breakFlag = false
        val input = br.readLine().split(" ").map { it.toInt() }.drop(1).toList()
        //val widow = IntArray(input.size)
        //println(input)
        for (i in 2..input.size) { //연속해서 더할개수
            val window = input.windowed(i)
            //println(window)
            for (j in window.indices) {
                if (isPrime(window[j].sum()) && window[j].sum() > 2) {
                    //println(window[j].sum())
                    ans = i
                    ans2 = window[j].joinToString(" ")
                    breakFlag = true
                    break
                }
            }

            if (breakFlag) {
                break
            } else {
                continue
            }
        }

        if (ans == null) {
            sb.append("This sequence is anti-primed.\n")
        } else {
            sb.append("Shortest primed subsequence is length $ans: ${ans2}\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}*/
