import kotlin.math.sqrt

fun isPrimeNumber(x : Int) : Boolean {
    val end = sqrt(x.toDouble()).toInt()
    for (i in 2..end) {
        if (x % i == 0) return false
    }
    return true
}


fun checkPrimeCnt(prime : Int) : ArrayList<Int> {
    val primeArr = arrayListOf<Int>()

    for (i in prime+1..prime*2) {
        val isPrime = isPrimeNumber(i)

        if (isPrime) {
            primeArr.add(i)
        }
    }

    return primeArr
}

fun main() {
    val answer = arrayListOf<Int>()

    while (true) {
        val input = readln().toInt()
        if (input == 0) {
            break
        }
        val temp = checkPrimeCnt(input)
        answer.add(temp.size)
    }

    answer.forEach {
        println(it)
    }
}