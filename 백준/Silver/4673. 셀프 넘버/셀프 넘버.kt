import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun sumOfDigits(num: Int): Int {
    var number = num
    var sum = 0

    while (number > 0) {
        sum += number % 10
        number /= 10
    }
    return sum
}

fun check(booleanArray: BooleanArray, i: Int) {
    if (i > 10000) {
        return
    }
    var temp = i
    while (true) {
        val digitSum = sumOfDigits(temp)
        temp += digitSum

        if (temp > 10000 || booleanArray[temp]) {
            break
        } else {
            booleanArray[temp] = true
        }
    }
}

fun main() {
    val booleanArray = BooleanArray(10001) { false }

    for (i in 1..10000) {
        check(booleanArray, i)
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (index in 1..10000) {
        if (!booleanArray[index]) {
            bw.write(index.toString())
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}