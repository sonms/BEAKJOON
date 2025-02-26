import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val input = readln().toInt()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for (i in 0 until input) {
        val game = br.readLine().split(",")
        var year = 0
        var day = 0
        var hour = 0
        var min = 0

        year = game[1].toInt() / 525600
        day = (game[1].toInt() % 525600) / 1440
        hour = (game[1].toInt() % 1440) / 60
        min = game[1].toInt() % 60

        val result = buildString {
            append("${game[0]} - ")

            if (year > 0) append("$year year(s) ")
            if (day > 0) append("$day day(s) ")
            if (hour > 0) append("$hour hour(s) ")
            if (min > 0) append("$min minute(s)")
        }

        bw.write(result.trim())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}