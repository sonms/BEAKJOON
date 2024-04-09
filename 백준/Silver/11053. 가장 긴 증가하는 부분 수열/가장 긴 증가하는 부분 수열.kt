import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val dp = IntArray(n){1} //각 위치까지의 가장 긴 증가하는 부분 수열의 길이를 저장
    //dp가 1부터 시작인 이유는 자기자신이 처음에는 가장기니까
    //dp[2] = 3이면 0~2까지의 가장긴배열수가 3
    //var cnt = 0
    val arr = br.readLine().split(" ").map { it.toInt() }
/*    dp[0] = arr[0]*/
    /*val checkList = ArrayList<Pair<Int, Int>>()
    for (j in arr.indices) {
        checkList.add(Pair(arr[j], j))
    }


    for (i in 1 until dp.size) {
       *//*for (j in i until arr.size) {

       }*//*
        dp[i] = checkList.filter { it.first > dp[i-1] && it.second >= i}.minOfOrNull { it.first }!!
        println(dp[i].toInt())
        println(checkList.filter { it.first > dp[i-1] && it.second >= i})
    }*/
    for (i in 1 until n) {
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    val answer = dp.maxOrNull() ?: 0
    bw.write(answer.toString())
    bw.flush()
    bw.close()
}