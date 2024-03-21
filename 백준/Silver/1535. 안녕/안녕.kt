fun main() {
    val n = readLine()!!.toInt()
    val hp = readLine()!!.split(" ").map { it.toInt() }
    val pleasure = readLine()!!.split(" ").map { it.toInt() }

    val dp = IntArray(100) { 0 }

    for (i in 0 until n) {
        for (j in 99 downTo hp[i]) { //체력
            dp[j] = maxOf(dp[j], dp[j - hp[i]] + pleasure[i])
        }
    }

    println(dp[99])
}