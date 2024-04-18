import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val set = HashSet<String>() // 해시 집합을 사용하여 입장한 사람을 저장
    //val map = HashMap<String, Boolean>() // 해시 맵을 사용하여 사람의 입장 여부를 저장

    val n = br.readLine().toInt() // 입력받을 명령의 수
    repeat(n) {
        val (name, action) = br.readLine().split(" ") // 이름과 행동을 분리하여 입력받음
        when (action) {
            "enter" -> {
                set.add(name) // 집합에 이름 추가
                //map[name] = true // 맵에 해당 이름의 입장 여부 추가
            }
            "leave" -> {
                set.remove(name) // 집합에서 이름 제거
                //map[name] = false // 맵에서 해당 이름의 입장 여부 제거
            }
        }
    }

    // 집합에 있는 사람들을 내림차순으로 정렬하여 출력
    set.sortedDescending().forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}