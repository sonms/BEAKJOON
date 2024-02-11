//중복순열 개수만 구하기
fun permutation(n: Int, m: Int) {
    val dp = Array(n + 1) { 0 }
    dp[0] = 1

    //예를들어
    /* n=5, m=3일때
    i = 1 주어진 숫자 0~5중 1개만 뽑을 때
    j = 1~5 위에서 0은 아무것도 안뽑았을 경우
    나머지 dp[1]=dp[1]+dp[0]=1
    ...
    나머지도 dp[2] = dp[2]+dp[1]=1...
    해서 dp = [1,1,1,1,1,0] 가 되고

    i=2 주어진 숫자중이제 2개씩뽑을때
    j=1 dp[1] = dp[1]+dp[0] = 1+1 = 2
    ...
    해서 i=3까지 뽑을 때까지 전부 메모이제이션을 통해
    경우의 수를 산출하는방식
    *
    * */
    for (i in 1..m) { //뽑는 개수
        for (j in 1..n) { //뽑을 숫자 범위
            dp[j] = (dp[j] + dp[j - 1]) % 1000000000
        }
    }


    println(dp[n])
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    permutation(n, m)
}