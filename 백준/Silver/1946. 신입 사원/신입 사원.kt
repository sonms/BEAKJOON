import kotlin.math.max

fun main() {
    val t = readln().toInt()
    var maxInterviewRank = 0
    val answer = IntArray(t) {1}

    repeat(t) { testCase ->
        val n = readln().toInt()
        val rank = arrayListOf<Pair<Int, Int>>()

        repeat(n) {
            val temp = readln().split(" ").map { it.toInt() }
            rank.add(Pair(temp[0], temp[1]))
        }

        val sortRankList = rank.sortedWith(
            compareBy ({ it.first }, {it.second})
        )
        maxInterviewRank = sortRankList.first().second

        for (i in sortRankList.indices) {
            if (sortRankList[i].second < maxInterviewRank) {
                maxInterviewRank = sortRankList[i].second
                answer[testCase] += 1
            }
        }
    }

    answer.forEach {
        println(it)
    }
}