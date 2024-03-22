import kotlin.math.pow

fun main() {
    //, 10의 제곱수를 곱하게 될 경우 끝자리에 0이 붙게 됩니다. 즉 2와 5의 조합에 따라 0이 생긴다고 보면되죠.
    /*15!

    = (1 x 2 x 3 x 4 x 5) x (6 x 7 x 8 x 9 x 10) x (11 x 12 x 13 x 14 x 15)

    5의 배수를 앞으로 모아줍니다.*/
    // (5 x 10 x 15) x (1 x 2 x 3 x 4) x (6 x 7 x 8 x 9) x (11 x 12 x 13 x 14)
    //따라서 끝자리가 1, 2, 3, 4인 묶음이든, 6, 7, 8, 9인 묶음이든 0이 아닌 마지막 수는 4가 나옵니다.
    //0을 만들어내는 10을 없애주기 위해 2와 5를 조합해줍니다.
    //10^3 x 6 x 2^3 //10은 앞서 말했듯 끝자리 수에 영향 없는 0만 만들어주기 때문에
    //3! x 2^3
    //N에 대해서 위의 방식대로 정리하게 되면
    //A! x 2^p 의 구조가 나오게 됩니다.
    //dp[3] x 8)%10 이 15!의 0이 아닌 마지막 자릿수
    /*그렇다면 17!은 어떻게 구할 수 있을까요?
    17!= dp[15] x 16 x 17
    = dp[15] x 6 x 7
    즉, N보다 작은 5의 배수의(=temp) dp값을 기준으로 temp+1~ N까지의 수를 곱해주면서 %10을 해주면 구할 수 있습니다.*/

    var temp: Int
    val N: Int = readln().toInt()
    val dp: IntArray = IntArray(20001)

    //2^n digit: 2 4 6 8
    dp[0] = 1
    dp[1] = 1 //1! = 끝자리 1
    dp[2] = 2 //2! = 끝자리 2
    dp[3] = 6 //3! = 끝자리 6
    dp[4] = 4 //4! = 끝자리 24=>4
    for (i in 5..N) { //dp[5] = 5!의 끝자리 부터 시작
        if (i % 5 == 0) { //안에 5의 배수가 들어있다면 5! = 5 x (1 x 2 x 3 x 4) = 1! x 2^1
            temp = i / 5
            dp[i] = dp[temp] * 2.0.pow((temp % 4).toDouble()).toInt() % 10
        } else {
            temp = i / 5 * 5
            dp[i] = dp[temp]
            for (j in temp + 1..i) {
                dp[i] = dp[i] * j % 10
            }
        }
    } //end for
    println(dp[N])
}