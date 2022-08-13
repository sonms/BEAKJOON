import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun levelingTheGround(arr: ArrayList<Int>, n: Int, m: Int, b: Int,sum:BigInteger): Pair<Int, Int> {
    val indexSize = n * m
    var minTime = Int.MAX_VALUE
    var mHeight = 0
    var maxHeight = (sum.plus(b.toBigInteger())).divide((n*m).toBigInteger())
    //maxHeight = 가지고있는 블럭과 입력받은 집터의 높이의 합과 나누기 집터의 크기를 통해
    //땅의 높이가 같으면서 최대로 만들 수 있는 높이를 계산할 수 있다.
    val max = 256
    //maxHeight가 max보다 크다면
    if (maxHeight.compareTo(max.toBigInteger()) == 1) {
        max.also { maxHeight = it.toBigInteger() }
    } else {
        maxHeight.toInt()
    }
    for (height in 0..maxHeight.toInt()) {
        var time = 0
        for (i in 0 until indexSize) {
            //전부 돌면서 체크할거라 횟수 의미 x
            if (arr[i] < height) {
                val gap = height - arr[i]
                time += gap
            } else if (arr[i] > height) {
                val gap = arr[i] - height
                time += gap * 2
            }
        }
        if (minTime >= time) {
            minTime = time
            mHeight = height
        }
    }
    return Pair(minTime, mHeight)
}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ")
    val n = input[0].toInt()
    val m = input[1].toInt()
    val b = input[2].toInt()
    var sum = BigInteger("0")
    var k = 0//반복제어변수

    val houseSite = arrayListOf<Int>()
    while (true) { //입력받은 집터 배열에 저장하는 while
        if (k == n) {
            break
        }
        val s = br.readLine().split(" ")
        for (i in 0 until m) {
            houseSite.add(s[i].toInt())
            sum += s[i].toBigInteger()
        }
        k++
    }
    val result = levelingTheGround(houseSite,n,m,b,sum)
    println(result.toList().joinToString(" ","",""))
}

