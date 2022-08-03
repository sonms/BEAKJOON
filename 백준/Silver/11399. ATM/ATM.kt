import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var temp : Long = 0
    var sum : Long = 0
    val input1 = br.readLine().toInt() //사람수
    val input2 = br.readLine().split(" ")
    val arr = arrayListOf<Long>()

    for (i in 0 until input1) {
        arr.add(input2[i].toLong())
    }

    arr.sort()

    for (j in arr.indices) {
        temp += arr[j]
        sum += temp
    }
    print(sum)
}