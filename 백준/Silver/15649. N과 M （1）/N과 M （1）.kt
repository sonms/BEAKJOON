import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val result = ArrayList<String>()

fun generatePermutations(
    nums: List<Int>, //탐색할 배열
    tempList: MutableList<Int>, // 임시 리스트
    used: BooleanArray, // 방문 여부를 나타내는 배열
    length: Int, //현재 순열의 길이
    targetLength: Int //원하는 순열의 길이
) {
    if (length == targetLength) {
        //println(tempList)
        result.add(tempList.joinToString(" "))
        return
    }
    for (i in nums.indices) {
        if (!used[i]) {
            tempList.add(nums[i])
            used[i] = true
            generatePermutations(nums, tempList, used, length + 1, targetLength)
            used[i] = false
            tempList.removeAt(tempList.size - 1)
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nums = mutableListOf<Int>() // 순열을 생성할 리스트
    val (n,m) = br.readLine().split(" ").map { it.toInt() }

    for (i in 1..n) {
        nums.add(i)
    }

    val tempList = mutableListOf<Int>() // 임시 리스트
    val used = BooleanArray(nums.size) // 방문 여부를 나타내는 배열
    /*val targetLength = nums.size*/ // 원하는 순열의 길이

    generatePermutations(nums, tempList, used, 0, m)

    result.forEach {
        bw.write(it)
        bw.newLine()
    }
    bw.flush()
    bw.close()
}