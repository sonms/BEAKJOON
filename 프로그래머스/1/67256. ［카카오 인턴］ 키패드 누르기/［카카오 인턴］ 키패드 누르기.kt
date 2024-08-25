import kotlin.math.abs
class Solution {
//좌표거리 계산
    fun manhattanDistance(coord1: Pair<Int, Int>, coord2: Pair<Int, Int>): Int {
        return abs(coord1.first - coord2.first) + abs(coord1.second - coord2.second)
    }
    
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        val leftNum = listOf<Int>(1,4,7)
        val rightNum = listOf<Int>(3,6,9)
        val middleNum = listOf<Int>(2,5,8,0)
        val numPad = arrayOf(
            arrayOf("*", "0", "#"),  // 0번째 행
            arrayOf("7","8","9"),  // 1번째 행
            arrayOf("4","5","6"),  // 2번째 행
            arrayOf("1","2","3")   // 3번째 행
        )
        //좌표를 저장
        val numPadMap = mutableMapOf<String, Pair<Int, Int>>()

        for (i in numPad.indices) {
            for (j in numPad[i].indices) {
                numPadMap[numPad[i][j]] = Pair(i, j)
            }
        }

        

        var leftPos = "*"
        var rightPos = "#"
        

        for (i in numbers) {
                //println("click $leftPos $rightPos $i")
                if (leftNum.contains(i)) {
                    leftPos = i.toString()
                    answer += "L"//i.toString()
                } else if (rightNum.contains(i)) {
                    rightPos = i.toString()
                    answer += "R"//i.toString()
                } else if (middleNum.contains(i)){
                    val left = manhattanDistance(numPadMap[leftPos]!!, numPadMap[i.toString()]!!)
                    val right = manhattanDistance(numPadMap[rightPos]!!, numPadMap[i.toString()]!!)//abs(i-rightPos.toInt()) //max(rightPos.toInt(), i) - min(rightPos.toInt(), i)

                    if (left == right) {
                        if (hand == "right") {
                            answer += "R"
                            rightPos = i.toString()
                        } else {
                            answer += "L"
                            leftPos = i.toString()
                        }
                    } else if (left > right) {
                        answer += "R"
                        rightPos = i.toString()
                    } else {
                        answer += "L"
                        leftPos = i.toString()
                    }
                }
            }
        
        return answer
    }
}