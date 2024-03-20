fun calculateWinRate(X: Int, Y: Int): Int {
    return (Y.toLong() * 100 / X).toInt()
}

fun minGamesToChangeWinRate(X: Int, Y: Int) {
    val Z = (Y.toLong() * 100 / X).toInt()
    var answer = -1
    var left = 0
    var right = 1000000000
    while (left <= right) {
        val mid = (left + right) / 2
        if (calculateWinRate(X + mid, Y + mid) != Z) {
            answer = mid
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    println(answer)
}

fun main() {
    val(X,Y) = readln().split(" ").map { it.toInt() }
    minGamesToChangeWinRate(X, Y)
}