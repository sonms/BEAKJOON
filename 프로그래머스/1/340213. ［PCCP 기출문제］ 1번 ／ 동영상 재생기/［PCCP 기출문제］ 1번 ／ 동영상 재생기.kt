fun isOp(pos : Int, opStart : Int, opEnd : Int) : Int {
    return if (pos in opStart..opEnd) opEnd else pos
}

fun conversionTime(time : String) : Int {
    val (minutes, seconds) = time.split(":").map { it.toInt() }
    return minutes * 60 + seconds
}

class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        var answer: String = ""
        val videoInt = conversionTime(video_len)
        var posInt = conversionTime(pos)
        val opStart = conversionTime(op_start)
        val opEnd = conversionTime(op_end)
        
        for (i in commands) {
            posInt = isOp(posInt, opStart, opEnd)
            when(i) {
                "next" -> {
                    posInt = isOp((posInt + 10).coerceAtMost(videoInt), opStart, opEnd)
                }
                "prev" -> {
                    posInt = isOp((posInt - 10).coerceAtLeast(0), opStart, opEnd)
                }
            }
            
        }
        
        answer = "${String.format("%02d",posInt / 60)}:${String.format("%02d", posInt % 60)}"
        
        return answer
    }
}