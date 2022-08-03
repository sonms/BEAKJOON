import java.util.*

var n : Int = 0
var m : Int = 0
var cnt = 0
var tmp = 0
var graph = Array(0) { Array(0) { 0 } }
var visit = Array(0){0}

fun BFS(x : Int) {
    val q : Queue<Int> = LinkedList<Int>()
    q.offer(x) //객체추가(가득차면 false반환) -> add
    visit[x] = 1 //true
    var level = 0
    while (!q.isEmpty()) {
        for(i in 0 until q.size) {
            tmp = q.poll()
            for (j in 1..n) {
                if (graph[tmp][j] == 1 && visit[j] == 0) {
                    q.add(j)
                    cnt++
                    visit[j] = 1
                }
            }
        }
        level++
        if (level == 2) {
            break
        }
    }
}
fun main() {
     n = readLine()!!.toInt()
     m = readLine()!!.toInt()
    var a = 0
    var b = 0
    graph = Array(n+1) { Array(n + 1) { 0 } }
    visit = Array(n+1) {0}
    for (i in 1..m) {
        val (f,s) = readLine()!!.split(" ")
        a = f.toInt()
        b = s.toInt()
        graph[a][b] = 1
        graph[b][a] = 1
    }
    BFS(1) //시작 정점

    print(cnt)
}