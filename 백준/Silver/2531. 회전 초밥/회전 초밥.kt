import kotlin.math.max

val br = System.`in`.bufferedReader()

fun main() {
    val (N, d, k, c) = br.readLine().split(" ").map { it.toInt() }

    val belt = ArrayList<Int>()
    var maxCnt = 0

    repeat(N) {
        belt.add(br.readLine().toInt())
    }
    
    for (start in 0 until N) {
        //윈도우 -> 원형 큐 방식
        val currentWindow = IntArray(k) { belt[(start + it) % N] }

        //중복 제거
        val kindSet = currentWindow.toSet()
        //초밥쿠폰 추가
        val kindCnt = kindSet.size + if (c !in kindSet) 1 else 0

        maxCnt = max(maxCnt, kindCnt)
    }

    println(maxCnt)
}