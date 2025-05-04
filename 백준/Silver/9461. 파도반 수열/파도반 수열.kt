fun main() {
    val input = readLine()!!.toInt()
    val dp = LongArray(101){_ -> 0}
    val result = arrayListOf<Long>()
    val sb = StringBuilder()
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1
    dp[4] = 2
    dp[5] = 2
    for (i in 1..input) {
        val input2 = readLine()!!.toInt()
        if (input2 < 6) {
            result.add(dp[input2])
        } else {
            for (j in 6..input2) {
                dp[j] = dp[j-5] + dp[j-1]
            }
            result.add(dp[input2])
        }
    }
    result.forEach {
        sb.append(it).append("\n")
    }
    print(sb)
}