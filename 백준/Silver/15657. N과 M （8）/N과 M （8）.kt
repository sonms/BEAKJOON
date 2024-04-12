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
        //var isB = false
        var cnt = 0 //최대가 바뀐횟수
        //println(tempList)
        //var firstMax = tempList.maxOrNull()
        var temp = Pair(tempList.first(), 0)
        if (tempList.size > 1) {
            for (i in 0 until tempList.size) {
                if (temp.first <= tempList[i] && temp.second < i) {
                    temp = temp.copy(first = tempList[i], second = i)
                    //result.add(tempList.joinToString(" "))
                    //println("s " + temp)
                    cnt ++
                }
            }
            if (cnt == tempList.size-1) {
                result.add(tempList.joinToString(" "))
            }
        } else {
            result.add(tempList.joinToString(" "))
        }

        /*if (isB) {
            println(isB)
            result.add(tempList.joinToString(" "))
        }*/
        return
    }
    for (i in nums.indices) {
        if (!used[i]) {
            tempList.add(nums[i])
            used[i] = false
            generatePermutations(nums, tempList, used, length + 1, targetLength)
            tempList.removeAt(tempList.size - 1)
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val nums = br.readLine().split(" ").map { it.toInt() }.sorted() // 순열을 생성할 리스트


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