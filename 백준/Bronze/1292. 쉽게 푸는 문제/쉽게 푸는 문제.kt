fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val arr = arrayListOf<Int>()
    var answer = 0

    for (i in 1..b) {
        for (j in 0 until i) {
            arr.add(i)
        }
    }
    
    for (i in a - 1 until b) {
        answer += arr[i]
    }

    print(answer)

}