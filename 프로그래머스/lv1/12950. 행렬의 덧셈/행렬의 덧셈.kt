class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size){i -> IntArray(arr1[i].size) }
        for (j in arr1.indices) {
            for (k in arr1[j].indices) {
                answer[j][k] = arr1[j][k] + arr2[j][k]
            }
        }
        return answer
    }
}