fun main() {
    val (n, m) = readln().split(" ").map {it}
    var answer = 0L
    for (i in n.indices) {
        for(j in m.indices) {
            answer += n[i].toString().toLong() * m[j].toString().toLong()
        }
    }

    print(answer)
}