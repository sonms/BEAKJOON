class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothesType = HashMap<String, Int>()
        
        for (i in clothes.indices) {
            if(clothesType.containsKey(clothes[i][1])) {
                clothesType[clothes[i][1]] = clothesType[clothes[i][1]]!! + 1
            } else {
                clothesType[clothes[i][1]] = 1
            }
        }
        
        for (j in clothesType.values) {
            answer *= j+1
        }
        
        return answer-1
    }
}