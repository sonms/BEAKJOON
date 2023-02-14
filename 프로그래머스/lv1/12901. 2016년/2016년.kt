import java.util.Calendar
class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val c = Calendar.getInstance()
        c.add(Calendar.YEAR, -7)
        /*if (a - 2 < 0) {
            c.add(Calendar.MONTH, 2 - a)
        } else {
            c.add(Calendar.MONTH, a - 2)
        }
        
        if (b - 14 < 0) {
            c.add(Calendar.DATE, 14 - b)
        } else {
            c.add(Calendar.DATE, b - 14)
        }*/
        c.add(Calendar.MONTH, a - 2)
        c.add(Calendar.DATE, b-14)
        val nw : Int = c.get(Calendar.DAY_OF_WEEK)
        if (nw == 1) {
            answer = "SUN"
        } else if (nw == 2) {
            answer = "MON"
        } else if (nw == 3) {
            answer = "TUE"
        } else if (nw == 4) {
            answer = "WED"
        } else if (nw == 5) {
            answer = "THU"
        } else if (nw == 6) {
            answer = "FRI"
        } else if (nw == 7) {
            answer = "SAT"
        }
        return answer
    }
}