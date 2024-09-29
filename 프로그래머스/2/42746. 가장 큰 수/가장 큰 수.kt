class Solution {
    fun solution(numbers: IntArray): String {
        /*return numbers.sortedWith { a, b ->
            val strA = a.toString()
            val strB = b.toString()

            //자기를 numbers에서 가장 큰 수의 길이 만큼 반복하여 그 길이만큼 뽑아 비교
            val repeatA = strA.repeat(numbers.maxOrNull().toString().length  / strA.length + 1).substring(0, numbers.maxOrNull().toString().length)
            val repeatB = strB.repeat(numbers.maxOrNull().toString().length / strB.length + 1).substring(0, numbers.maxOrNull().toString().length)

            repeatB.compareTo(repeatA)
        }.joinToString("") */
        
        var answer = ""
        
        val sortedNumbers = numbers.sortedWith { a, b ->
        val strA = a.toString()
        val strB = b.toString()


            (strB + strA).compareTo(strA + strB)
        }.joinToString("")
        answer = if (sortedNumbers[0].toString() == "0") {
            "0"
        } else {
            sortedNumbers
        }
        
        return answer
    }
}