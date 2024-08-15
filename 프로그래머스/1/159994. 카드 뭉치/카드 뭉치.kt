class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        
        var cards1Index = 0
        var cards2Index = 0
        var goalIndex = 0

        while (goalIndex < goal.size) {
            if (goal[goalIndex] == cards1[cards1Index]) {
                //println(cards1[cards1Index] + " " + goal[0])
                goal[goalIndex] = ""
                cards1Index = minOf(cards1Index+1, cards1.size-1)
                goalIndex += 1

            } else if (goal[goalIndex] == cards2[cards2Index]) {
                //println("$goalIndex $cards2Index")

                goal[goalIndex] = ""
                cards2Index = minOf(cards2Index+1, cards2.size-1)
                goalIndex += 1
            } else {
                break
            }
        }

        if (goal.all {it == ""}) {
            answer = "Yes"
        } else {
            answer = "No"
        }
        return answer
    }
}