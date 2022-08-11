import java.io.*

var arr = LongArray(0) {0}
var tree = LongArray(0){0}
fun segmentTree_init(start:Int,end: Int,node: Int) : Long {
    if (start == end) {
        return arr[start].also { tree[node] = it }
    }
    val mid = (start+end) / 2
    return (segmentTree_init(start,mid,node*2) + segmentTree_init(mid+1, end, node * 2 + 1)).also { tree[node] = it }
}

fun segmentTree_sum(start : Int, end : Int, node : Int, left:Int, right:Int) : Long {
    if(right < start || end < left) {
        return 0
    }
    if (left <= start && end <= right) {
        return tree[node]
    }
    val mid = (start+end)/2
    return segmentTree_sum(start, mid, node*2, left, right) + segmentTree_sum(mid+1, end, node*2+1, left, right)
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val (n,m) = br.readLine().split(" ")
    val answer = arrayListOf<Long>()
    arr = LongArray(n.toInt()+1){0}
    tree = LongArray(n.toInt()*4){0}
    val temp = br.readLine().split(" ").map { it }

    for (k in temp.indices) {
        arr[k] = temp[k].toLong()
    }
    segmentTree_init(0, n.toInt()-1, 1)

    for (i in 1..m.toInt()) {
        val (f,s) = br.readLine().split(" ")
        val sum = segmentTree_sum(0, n.toInt()-1, 1, f.toInt()-1,s.toInt()-1)
        answer.add(sum)
    }
    answer.forEach {
        sb.append(it).append("\n")
    }
    print(sb)
}