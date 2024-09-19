class Solution {
    
        //수직판단 0,0 / 0,2 이동 시 col값 0~2로 움직일때 X가 존재하는지 판단
    fun checkVerticalPosition(pos : Pair<Int, Int>, checkPos : Pair<Int, Int>, endPos : Pair<Int, Int>, blockCheck : List<String>) : Boolean {
        if (checkPos.first in 0..endPos.first && checkPos.second in 0..endPos.second){
            if (pos.first == checkPos.first) {
                val startCol = minOf(pos.second, checkPos.second)
                val endCol = maxOf(pos.second, checkPos.second)
                for (col in startCol..endCol) {
                    if (blockCheck[pos.first][col] == 'X') {
                        return false
                    }
                }
                return true
            }
        }
        return false
    }

    //수평판단 0,2 / 2,2 row값이 0~2로 이동할 때 x의 존재 판단
    fun checkHorizontalPosition(pos : Pair<Int, Int>, checkPos : Pair<Int, Int>, endPos : Pair<Int, Int>, blockCheck : List<String>) : Boolean {
        if (checkPos.first in 0..endPos.second && checkPos.second in 0..endPos.first) {
            if (pos.second == checkPos.second) {
                val startRow = minOf(pos.first, checkPos.first)
                val endRow = maxOf(pos.first, checkPos.first)
                for (row in startRow..endRow) {
                    if (blockCheck[row][pos.second] == 'X') {
                        return false
                    }
                }
                return true
            }
        }
        return false
    }
    
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val park = park.toList()
        var answer: IntArray = intArrayOf()
        
        var startPos : Pair<Int, Int>? = null
        val endPos = Pair(park.size-1, park[0].length-1)
        for (rowIndex in park.indices) {
            val columnIndex = park[rowIndex].indexOf('S')
            if (columnIndex != -1) {
                startPos = Pair(rowIndex, columnIndex)
                break // S를 찾으면 반복 종료
            }
        }
        
        for (op in routes) {
            when(op.split(" ").first()) {
                "E" -> {
                    val checkPos = startPos?.copy( //0row,2col
                        second = startPos.second + op.split(" ").last().toInt()
                    )
                    startPos = if (checkVerticalPosition(startPos!!, checkPos!!, endPos, park)) {
                        checkPos
                    } else {
                        startPos
                    }
                }
                "N" -> {
                    val checkPos = startPos?.copy(
                        first = startPos.first - op.split(" ").last().toInt()
                    )
                    startPos = if (checkHorizontalPosition(startPos!!, checkPos!!, endPos, park)) {
                        checkPos
                    } else {
                        startPos
                    }
                }
                "W" -> {
                    val checkPos = startPos?.copy(
                        second = startPos.second - op.split(" ").last().toInt()
                    )
                    startPos = if (checkVerticalPosition(startPos!!, checkPos!!, endPos, park)) {
                        checkPos
                    } else {
                        startPos
                    }
                }
                "S" -> {
                    val checkPos = startPos?.copy(
                        first = startPos.first + op.split(" ").last().toInt()
                    )
                    startPos = if (checkHorizontalPosition(startPos!!, checkPos!!, endPos, park)) {
                        checkPos
                    } else {
                        startPos
                    }
                }
            }
        }
        startPos?.let { pos ->
            answer = intArrayOf(pos.first, pos.second)
        }
        return answer
    }
}