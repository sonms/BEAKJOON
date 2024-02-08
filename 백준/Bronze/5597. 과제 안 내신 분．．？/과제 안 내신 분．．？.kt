fun main() {
    val boolArr = BooleanArray(31) {false}
    boolArr[0] = true
    repeat(28) {
        val input = readln().toInt()
        boolArr[input] = true
    }
    boolArr.forEachIndexed { index, value ->
        if (!value) {
            println(index)
        }
    }
}