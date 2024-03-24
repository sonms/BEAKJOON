import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val answer = arrayListOf<Int>()

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) {
            break
        } else {
            val revenueArr = arrayListOf<Int>()
            repeat(n) {
                revenueArr.add(br.readLine().toInt())
            }

            var maxSum = revenueArr[0]
            var currentSection = revenueArr[0]

            for (i in 1 until  n) {
                //현재 위치까지의 구간(i=1인구간)과 0~1까지의 구간 중 큰값을 저장
                //그래서 최대인구간만을 가지고 계속갱신을 하면서
                //결국엔 최대값을 가진 구간을 확인가능
                //i = 2 이면 1~2까지의 구간이 가장큼
                //i=3이면 1~3까지의 구간이 3번째 단하나의 구간보다 더크지만
                //구간의 합이 최대는 아님 왜냐하면 1~2까지 의 구간이 13이고
                //1~3까지의 구간은 11이니까 그걸 계속해서 갱신하면서
                //결국에는 최대만 남음
                currentSection = maxOf(revenueArr[i], currentSection+revenueArr[i])
                maxSum = maxOf(maxSum, currentSection)
            }
            answer.add(maxSum)
        }
    }

    answer.forEach {
        bw.write(it.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}