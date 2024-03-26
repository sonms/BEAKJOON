fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var count = 0
    var num = readLine().map { it.toInt() - 48 }

    while (num.size != 1) {
        count++
        num = num.sum().toString().map { it.toInt() - 48 }
    }

    println(count)
    println(
        when(num[0]) {
            3,6,9 -> "YES"
            else -> "NO"
        }
    )
}