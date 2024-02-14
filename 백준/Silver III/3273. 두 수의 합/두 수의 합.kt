fun main() {
    val input = readln().toInt()

    val arr = readln().split(" ").map { it.toInt() }.sorted()

    val x = readln().toInt()
    var cnt = 0
    var left = 0
    var right = arr.size - 1

    while (left < right) {
        val sum = arr[left] + arr[right]
        if (sum == x) {
            cnt++
            left++
            right--
        } else if (sum < x) {
            left++
        } else {
            right--
        }
    }

    println(cnt)
}