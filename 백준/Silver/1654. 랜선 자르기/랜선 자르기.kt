fun main() {
    val input = readLine()!!.split(" ")
    val k = input[0].toInt()
    val n = input[1].toInt()
    var arr = mutableListOf<Long>()
    var max : Long = 0
    var min : Long = 0 //탐색길이 최솟값
    var mid : Long = 0 //범위내의 중간 길이 값
    for (i in 1..k){
        val t = readLine()!!.toLong()
        arr.add(t)
    }
    max = arr.maxOrNull()!!
    max++
    while (min < max) {
        mid = (max + min) / 2
        var cnt : Long = 0
        for (j in 0 until  arr.size) {
            cnt += arr[j] / mid
        }
        //mid길이로 잘랐을 때 개수가 만들고자 하는 랜선의 개수보다 작다면
        //자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다
        //그 외에는 자르고자 하는 길이를 늘려야 하므로 최소길이를 늘린다.
        if (cnt < n) {
            max = mid
        } else {
            min = mid + 1
        }
    }
    //upperbound로 얻어진 값에 -1이 최대 길이
    println(min - 1)
}