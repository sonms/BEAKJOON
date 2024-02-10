private val results = mutableListOf<Int>()
private val answer = mutableListOf<List<Int>>()

//cnt : 찾아야할개수
//depth : 찾은 개수
//start : 시작 인덱스
//arr:찾을 배열
fun combination(arr:List<Int>, count: Int = 0, index: Int = 0, depth: Int = 0) {
    if (depth == count) {
        //println("[${results.joinToString(", ")}]") // 완성된 조합
        answer.add(results.toList())
        return
    }

    for (i in index until arr.size) {
        results.add(arr[i])
        combination(arr, count, i + 1, depth + 1)
        results.removeAt(results.lastIndex)
    }
}

fun main() {
    val arr = ArrayList<Int>()
    repeat(9 ) {
        val input = readln().toInt()
        arr.add(input)
    }
    val sortArr = arr.sorted()
    //println(sortArr)

    combination(sortArr, 7,0,0)

    val answerFilter = answer.first { it.sum() == 100 }

    answerFilter.forEach {
        println(it)
    }
}