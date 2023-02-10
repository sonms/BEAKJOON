class Solution {
    data class Pair2(var first:Int, var second: Int)
    
    fun solution(answers: IntArray): ArrayList<Int> {
        //순서대로 수포자 1,2,3
        var fs = intArrayOf(1,2,3,4,5)
        var ss = intArrayOf(2,1,2,3,2,4,2,5)
        var ts = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        //가장 많이 맞춘 수포자 배열 (정답부분)
        var ai = arrayListOf<Int>()
        //가장 많이 맞춘 수포자를 찾을 배열
        var tttt = arrayListOf<Pair2>()
        //수포자1,수포자2,수포자3
        tttt.add(Pair2(1,0))
        tttt.add(Pair2(2,0))
        tttt.add(Pair2(3,0))
        
        //정답 배열이 위의 규칙배열보다 길 경우 규칙에 따라 배열 크기 증가 겸 정답이 맞는 지 체크
        for (i in answers.indices) {
            if (answers.size > fs.size) {
                while (fs.size < answers.size) {
                    fs += fs
                }
            } else if (answers.size > ss.size) {
                while (ss.size < answers.size) {
                    ss += ss
                }
            } else if (answers.size > ts.size) {
                while (ts.size < answers.size) {
                    ts += ts
                }
            }


            if (fs[i] == answers[i]) {
                tttt[0].second += 1
            }
            if (ss[i] == answers[i]) {
                tttt[1].second += 1
            }
            if (ts[i] == answers[i]) {
                tttt[2].second += 1
            }
        }
        //가장 큰 값이 뭔지 찾는 변수
        val m = tttt.maxOf { it.second }
        //위 변수를 통해 찾아낸 수포자들과 그 점수의 배열
        val at = tttt.filter { it.second == m }
        
        //위 변수를 통해 진짜 수포자를 찾음
        for (j in at.indices) {
            ai.add(at[j].first)
        }
        
        return ai
    }
}