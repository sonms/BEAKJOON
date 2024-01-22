fun main() {
    val n = readln().toInt()

    val a = readln().split(" ").map { it.toInt() }.sortedDescending()
    val b = readln().split(" ").map { it.toInt() }.sorted()
    var answer = 0

    repeat(n) {
        answer += a[it] * b[it]
    }
    print(answer)
}