fun calculation(q: ArrayDeque<Long>, cnt: Int, b: Int): Int {
    if (q.filter { it == b.toLong() }.size == 1) {
        return cnt+1
    }

    if (q.isEmpty()) {
        return -2
    }

    val newQ = ArrayDeque<Long>()
    for (j in q.indices) {
        newQ.add(q[j])
    }
    q.clear()

    for (i in newQ.indices) {
        val mul = newQ[i] * 2
        val add = (newQ[i].toString() + "1").toLong()

        if (mul <= b.toLong()) {
            q.add(mul)
        }

        if (add <= b.toLong()) {
            q.add(add)
        }
    }
    /*println("new" + newQ)
    println(q)*/

    val setCnt = cnt + 1

    return calculation(q, setCnt, b)
}

fun main() {
    val (a,b) = readln().split(" ").map { it.toInt() }
    val cnt = 0
    val mul = (a * 2).toLong()
    val add = (a.toString() + "1").toLong()

    val q = ArrayDeque<Long>()
    q.add(mul)
    q.add(add)

    val answer = calculation(q,cnt,b) + 1
    println(answer)
}