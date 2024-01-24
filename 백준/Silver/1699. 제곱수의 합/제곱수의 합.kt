import kotlin.math.min

fun main() {
    val input = readln().toInt() //N

    val dp = IntArray(input+1) { it }

    //var arr = 1,4,9,16,25...
    
    for (i in 2..input) {
        var j = 1
        while (j * j <= i) {
            dp[i] = min(dp[i], dp[i - j * j] + 1)
            /*println("i" + i)
            println("j" + j)
            println("dpi"+dp[i])
            println("dp i-"+(dp[i-j*j] + 1))*/
            j++
        }
    }


    print(dp[input])
}