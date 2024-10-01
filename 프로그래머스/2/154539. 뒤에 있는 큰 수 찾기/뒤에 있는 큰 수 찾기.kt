class Solution {
    fun solution(numbers: IntArray): IntArray {
        /*val numbersMap = numbers.mapIndexed { index, i ->
            Pair(i, index)
        }
        val ad = ArrayDeque(numbersMap)
        
        var answer: IntArray = intArrayOf()
        
        while (ad.isNotEmpty()) {
            val max = ad.maxByOrNull { it.first }
            val f = ad.removeFirst()

            if (f == max) {
                answer = answer.plus(-1)
                continue
            } else {
                for (i in ad) {
                    if (i.first > f.first) {
                        answer = answer.plus(i.first)
                        break
                    }
                }
            }
        }*/
        val result = IntArray(numbers.size) { -1 }
        val stack = ArrayDeque<Int>() 

        for (i in numbers.indices.reversed()) {
            while (stack.isNotEmpty() && stack.last() <= numbers[i]) {
                stack.removeLast()
            }
            if (stack.isNotEmpty()) {
                result[i] = stack.last()
            }
            stack.addLast(numbers[i])
        }
        
        return result
    }
}