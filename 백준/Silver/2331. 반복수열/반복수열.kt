import kotlin.math.pow

fun main() {
    val (a, p) = readln().split(" ").map {it}
    val arr= arrayListOf<Int>()
    arr.add(a.toInt())
    var temp = 0.0
    var i = 0

    while (true) {
        //한숫자끝 57 = 5^2+7^2
        for (j in arr[i].toString().indices) {
            //println(arr[i])
            temp += arr[i].toString()[j].toString().toDouble().pow(p.toInt())
        }

        if (arr.contains(temp.toInt())) {
            val index = arr.indexOf(temp.toInt())
            println(index)
            break
        } else {
            arr.add(temp.toInt())
        }
        temp = 0.0
        i += 1
    }
}