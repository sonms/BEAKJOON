//중복조합
//각 재귀 호출에서는
// 현재까지 선택된 원소들의 리스트(current)를 유지하고,
// 해당 리스트에 새로운 원소를 추가하여
// 다음 원소를 선택하는 모든 경우의 수를 고려합니다
/*
fun generateCombinations(n: Int, current: MutableList<Int> = mutableListOf(), result: MutableList<List<Int>> = mutableListOf()) {
    if (current.size == n) {
        result.add(current.toList())
        return
    }

    for (i in 0 until n) {
        current.add(i)
        generateCombinations(n, current, result)
        current.removeAt(current.size - 1)
    }
}

fun main() {
    val n = 3 // 변경 가능한 배열의 크기
    val result = mutableListOf<List<Int>>()
    generateCombinations(n, result = result)
    result.forEach { println(it) }
}*/

/*n: 생성할 조합의 길이입니다.
choices: 사용할 숫자 리스트입니다.
callback: 각 조합이 생성될 때 호출될 콜백 함수입니다. 콜백 함수는 생성된 조합을 받아 처리합니다.
함수는 생성된 모든 조합을 포함하는 리스트를 반환합니다.
내부에서 재귀적으로 조합을 생성하는 generate 함수를 호출합니다.
* */
/*
fun generateCombinations(n: Int, choices: List<Int>, callback: (List<Int>) -> Unit): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    */
/*
    current: 현재까지 생성된 조합을 나타내는 리스트입니다.
    index: 현재까지 생성된 조합의 길이를 나타냅니다.
    재귀 호출을 통해 조합을 생성하고, 생성된 조합은 콜백 함수를 통해 처리됩니다.
    각 숫자를 선택한 후, 재귀적으로 다음 숫자를 선택하고, 선택한 숫자를 다시 제거하여 모든 조합을 생성합니다.
    * *//*

    fun generate(current: MutableList<Int>, index: Int) {
        if (index == n) {
            callback(current.toList())
            return
        }
        for (choice in choices) {
            current.add(choice)
            generate(current, index + 1)
            current.removeAt(current.size - 1)
        }
    }

    generate(mutableListOf(), 0)
    return result
}

fun main() {
    val n = 4
    val choices = listOf(0, 1, 2)

    generateCombinations(n, choices) { result ->
        println(result)
    }
}*/

//고정 배열 중복조합
fun generateCombinations(n: Int, fixedArray: List<Int>, current: MutableList<Int> = mutableListOf(), result: MutableList<List<Int>> = mutableListOf()) {
    if (current.size == n) {
        result.add(current.toList())
        return
    }

    for (i in fixedArray) { // 고정된 배열을 사용
        current.add(i)
        generateCombinations(n, fixedArray, current, result)
        current.removeAt(current.size - 1)
    }
}

fun main() {
    val fixedArray = listOf(0, 1, 2) // 변경 가능한 고정된 배열
    val n = readln().toInt() // 중복 조합의 길이
    val result = mutableListOf<List<Int>>()
    generateCombinations(n, fixedArray, result = result)
    //result.forEach { println(it) }
    val answer = result.filter { it[0] != 0 && it.sum() % 3 == 0 }.size

    println(answer)
}
