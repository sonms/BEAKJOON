class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size) {_->0}
        
        for (i in commands.indices) {
            var targerList = array.slice((commands[i][0]-1) until commands[i][1])
            targerList = targerList.sorted()
            answer[i] = targerList[commands[i][2] - 1]
        }
        
        return answer
    }
}