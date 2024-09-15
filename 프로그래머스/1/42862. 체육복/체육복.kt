class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0  

        val receivableStudent = arrayListOf<Int>()

        val commonElements = lost.intersect(reserve.toList().toSet())
    /*println("교집합 $commonElements")
    println("차집합 ${reserve.subtract(commonElements).sorted()}")
    println("lost ${lost.subtract(commonElements).sorted()}")
*/
        val lostSet = lost.subtract(commonElements).sorted()
    
        for (i in reserve.subtract(commonElements).sorted()) {
            val checkLost = lostSet.find {
                it !in receivableStudent && (it == i - 1 || it == i + 1)
            }
        //println(checkLost)
            checkLost?.let {
                receivableStudent.add(it)
            }
       /* if (!receivableStudent.contains(checkLost)) {
            checkLost.let {
                receivableStudent.add(it)
                println("checkList $checkLost")
                println("add $it")
            }
        }*/
        //println(checkLost)
        }
        
        answer = n - lost.size + receivableStudent.size + commonElements.size
        return answer
    }
}