import java.io.BufferedWriter
import java.io.OutputStreamWriter

var results = mutableListOf<Int>()
var answer = mutableListOf<String>()

fun combination(arr : List<Int>, cnt : Int, index : Int, depth : Int) {
    if (depth == cnt) {
        //answer.add()
        answer.add(results.joinToString(" ")+"\n")
        return
    }

    for (i in index until arr.size) {
        results.add(arr[i])
        combination(arr, cnt, i+1, depth+1)
        results.removeAt(results.lastIndex)
    }
}

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }
    val deArr = arr.sorted()
    combination(deArr, m, 0, 0)
    //distinct는 배열이나 리스트에 중복된 값을 제거할 수 있다
    answer.distinct().forEach {
        bw.write(it)
    }
    bw.flush()
    bw.close()
}