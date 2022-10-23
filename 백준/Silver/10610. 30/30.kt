fun main() {
    val input = readLine()!!.toString().map { it.code - '0'.code }
    val sb = StringBuilder()
    val sort = input.sorted()
    if (input.contains(0)) {
        if (input.sum() % 3 == 0) {
            for (i in sort.indices) {
                sb.append(sort[sort.size-1-i])
            }
            print(sb.toString())
        } else {
            print(-1)
        }
    } else {
        print(-1)
    }
}