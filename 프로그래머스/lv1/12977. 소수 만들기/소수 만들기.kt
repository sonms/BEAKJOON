class Solution {
    val answerArr = arrayListOf<Int>()
    val answer = arrayListOf<Int>()
    
    fun isPrime(n : Int) : Boolean {
        var i = 2
        while ( i * i <= n) {
            if (n % i++ == 0) {
                return false
            }
        }
        return true
    }
    
    fun combination(arr : IntArray, cnt : Int, depth : Int, start : Int) {
        if (cnt == depth) {
            val ip = isPrime(answerArr.sum())
            if (ip) {
                answer.add(answerArr.sum())
            }
            return
        }

        for (i in start until arr.size) {
            answerArr.add(arr[i])
            combination(arr, cnt + 1, depth, i + 1)
            answerArr.removeAt(answerArr.lastIndex)
        }
    }
    
    fun solution(nums: IntArray): Int {
    
        combination(nums, 0, 3, 0)
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //println("Hello Kotlin")

        return answer.size
    }
}