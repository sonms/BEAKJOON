import java.io.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    //val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val box = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val dp = IntArray(n){1} //자기자신 1

    var answer = 0
    //i = 박스크기?
    //dp[i]=i크기에 담긴 박스 개수?
    for (i in 0 until n) {
        //자기 자신보다 이전에 있는 원소들 비교
        for (j in 0 until i) {
            //비교해서 그 원소의 값 + 1한값이 기존보다크면 선택
            if (box[i] > box[j] && dp[j] +1 > dp[i]) {
                dp[i] = dp[j]+1//maxOf(dp[i], dp[j]+1)
            }
        }
        answer = dp[i].coerceAtLeast(answer)
    }
    //println(dp.contentToString())
    println(answer)
}