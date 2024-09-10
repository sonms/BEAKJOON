class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val coordinate = arrayListOf<Pair<Int , Int>>()
        for (i in wallpaper.indices) {
            if (wallpaper[i].contains("#")) {
                for (j in wallpaper[i].indices) {
                    if (wallpaper[i][j] == '#') {
                        coordinate.add(Pair(i+1, j+1))
                    }
                }
            }
        }

        val maxX = coordinate.find { it.first == coordinate.maxOf { max ->max.first } } //맨오른쪽
        val maxY = coordinate.find { it.second == coordinate.maxOf { max ->max.second } }//맨아래쪽
        val minX = coordinate.find { it.first == coordinate.minOf { min-> min.first } }//맨왼쪽
        val minY = coordinate.find { it.second == coordinate.minOf { min ->min.second } }//맨위쪽

        if (coordinate.size == 1) {
         
            answer = intArrayOf(
                maxOf(maxX?.first!! - 1, 0),
                maxOf(maxY?.second!! - 1, 0),
                maxX.first,
                maxY.second
            )
            
        
        } else {
         
            answer = intArrayOf(
                maxOf(minX?.first!! - 1, 0), 
                maxOf(minY?.second!! - 1, 0),
                maxX?.first!!,
                maxY?.second!!,
            )
        
        }
        return answer
    }
}