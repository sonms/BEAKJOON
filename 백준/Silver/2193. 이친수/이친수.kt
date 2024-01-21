fun main() {
    val input = readln().toInt()
    val fibonacci = LongArray(input)
    fibonacci[0] = 1


    if (input <= 1) {
        print(fibonacci[0])
    } else {
        fibonacci[1] = 1
        for (i in 2 until input) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
        }
        print(fibonacci[input-1])
    }

}