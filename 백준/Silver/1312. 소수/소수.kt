fun main() {
    val input = readln().split(" ").map { it } //25 7 5
    var answer = input[0].toInt() % input[1].toInt()

    for (i in 0 until input[2].toInt()-1) {
        answer *= 10
        answer %= input[1].toInt()
    }
    answer *= 10
    answer /= input[1].toInt()
    print(answer)
    //println(31.41%10)
}