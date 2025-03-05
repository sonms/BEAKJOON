import java.io.BufferedReader
import java.io.InputStreamReader

fun winTeam(l : Int, o : Int, v : Int, e : Int): Int {
    return ((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val yeondu = br.readLine()
    val teamCnt = br.readLine().toInt()

    var max = -1
    var answer = ""

    repeat(teamCnt) {
        val team = br.readLine().toString()
        val temp = winTeam(
            yeondu.count { it == 'L' } + team.count { it == 'L' },
            yeondu.count { it == 'O' } + team.count { it == 'O' },
            yeondu.count { it == 'V' } + team.count { it == 'V' },
            yeondu.count { it == 'E' } + team.count { it == 'E' },
        )

        if (temp > max) {
            max = temp
            answer = team
        } else if (temp == max && team < answer) {
            answer = team
        }
    }

    println(answer)
}