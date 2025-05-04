fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val dp = LongArray(101) { 0L }
    dp[1] = 1L
    dp[2] = 1L
    dp[3] = 1L
    for (i in 4..100) {
        dp[i] = dp[i - 2] + dp[i - 3]
    }
    val sb = StringBuilder()
    repeat(t) {
        val n = readLine().toInt()
        sb.appendLine(dp[n])
    }
    print(sb)
}
