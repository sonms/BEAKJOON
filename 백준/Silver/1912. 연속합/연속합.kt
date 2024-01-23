import kotlin.math.max

fun main() {
    val input = readln().toInt()
    val numS = readln().split(" ").map { it.toInt() }

    val dp = IntArray(input){0}
    dp[0] = numS[0] //원소가 하나일때 최대 연속 부분합은 자기자신이 최대이기때문
    var maxSum = dp[0]

    for (i in 1 until numS.size) {
        //최적 부분 구조에 기인하여
        dp[i] = max(dp[i-1] + numS[i], numS[i])
        maxSum = max(maxSum, dp[i])
    }

    print(maxSum)
}