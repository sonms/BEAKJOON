fun main() {
    var input = readln().toString().chunked(1).map { it.toString() }
    input = input.sortedDescending()
    var answer = ""
    for (i in input.indices) {
        answer += input[i]
    }
    println(answer)
}