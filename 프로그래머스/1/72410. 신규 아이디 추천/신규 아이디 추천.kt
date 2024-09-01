class Solution {
    fun solution(new_id: String): String {
        var answer: String = new_id
        
        answer = answer
                .lowercase()
                .filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }
                .trim('.')

        while (answer.contains("..")) {
            answer = answer.replace("..", ".")
        }

        if (answer.isEmpty()) {
            answer += "a"
        }

        if (answer.length >= 16) {
            answer = answer.substring(0..14)
            answer = answer.trim('.')
        }

        if (answer.length <= 2) {
            while (answer.length != 3) {
                answer += answer.last()
            }
        }
      

        return answer
    }
}