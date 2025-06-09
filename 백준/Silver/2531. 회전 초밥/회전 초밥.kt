import kotlin.math.max

val br = System.`in`.bufferedReader()

fun main() {
    val (N, d, k, c) = br.readLine().split(" ").map { it.toInt() }

    val belt = IntArray(N) { br.readLine().toInt() }
    val count = IntArray(d + 1) // 초밥 번호는 1~d

    var uniqueSushi = 0
    var maxCnt = 0

    // 초기 윈도우 설정
    for (i in 0 until k) {
        if (count[belt[i]] == 0) uniqueSushi++
        count[belt[i]]++
    }

    // 쿠폰 초밥 포함 여부 확인
    maxCnt = if (count[c] == 0) uniqueSushi + 1 else uniqueSushi

    // 슬라이딩 윈도우 시작
    for (i in 1 until N) {
        // 윈도우에서 빠지는 초밥
        val outSushi = belt[(i - 1) % N]
        count[outSushi]--
        if (count[outSushi] == 0) uniqueSushi--

        // 윈도우에 새로 들어오는 초밥
        val newSushi = belt[(i + k - 1) % N]
        if (count[newSushi] == 0) uniqueSushi++
        count[newSushi]++

        // 쿠폰 초밥 포함 여부 확인
        val total = if (count[c] == 0) uniqueSushi + 1 else uniqueSushi
        maxCnt = max(maxCnt, total)
    }

    println(maxCnt)
}
