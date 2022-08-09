import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ")
    var targetWon = input[1].toInt() //4200
    val arr = mutableListOf<Int>() //가치의 배열
    var sum = 0 //동전개수의합
    for (i in 1..input[0].toInt()) {
        val s = br.readLine()
        arr.add(s.toInt())
    }
    while (true) {
        if (targetWon == 0) {
            break
        }
        var targetIndex = arr.binarySearch(targetWon).inv()

        if (arr.contains(targetWon)) {
            targetIndex = arr.indexOf(targetWon)
        }
        else if (targetIndex - 1 < 0) {
            targetIndex = 0
        } else {
            targetIndex -= 1
        }
        val v = arr[targetIndex]
        sum += targetWon / v
        targetWon -= v * (targetWon/v)
    }
    println(sum)
}