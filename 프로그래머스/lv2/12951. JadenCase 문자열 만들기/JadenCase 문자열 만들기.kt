class Solution {
    fun solution(s: String): String {
        return s.toLowerCase().split(" ").joinToString(" "){ it.capitalize() }
    }
}