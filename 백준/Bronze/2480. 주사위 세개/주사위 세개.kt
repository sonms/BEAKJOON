fun main() {
    val input = readln().split(" ").map { it.toInt() }
    var isCheck = false
    for (i in input.indices) {
        if (input.filter { it == input[i] }.size == 3) {
            print(10000+input[i]*1000)
            break
        } else if (input.filter { it == input[i] }.size == 2) {
            print(1000+input[i]*100)
            break
        }

        if (i == input.size-1) {
            isCheck = true
        }
    }

    if (isCheck) {
        print(input.maxOf { it } * 100)
    }
}