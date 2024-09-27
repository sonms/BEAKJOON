class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) { IntArray(arr2[0].size) }

        for (i in arr1.indices) { //[2,3,2] 행
            for (j in arr2[0].indices) { // [5,4,3] , [2,4,1] 행
                //answer[0] = intArrayOf(i.,j)
                //val tempArr = intArrayOf()
                for (k in arr2.indices) { //[5,4,3] 열
                    answer[i][j] += arr1[i][k] * arr2[k][j]
                }
            }
        }
        return answer
    }
}