import java.io.BufferedReader
import java.io.InputStreamReader
fun combination(answer:MutableList<List<Int>>,arr:IntArray , visited:BooleanArray, start:Int, n:Int,r:Int) {
    /*
    answer : 조합의 결과를 저장하는 이중 리스트
    arr : 조합을 구할 원소들의 배열
    visited : 원소 선택 여부를 확인하기 위한 배열 (중복체크)
    start : 탐색 시작 인덱스
    n : 총 개수
    r : target으로 n개 중 r개 만큼 고르기 위한 변수
     */
    if (r == 0) {
        answer.addAll(listOf(arr.filterIndexed{ index, _ -> visited[index] }))
        //addAll : 패러미터 안에 것을 answer에 복사
        //filterIndexed:인덱스를 통해 필터링 처리하기 위함 (visited의 인덱스를 이용해 필터링)
        return
    }
    for (i in start until n) {
        visited[i] = true
        combination(answer, arr, visited, i+1, n, r - 1)
        visited[i] = false
    }
}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ")
    val f = input[0].toInt()
    val s = input[1].toInt()
    var max = 0 //답출력을위한 변수
    var k = 0 //반복제어변수
    val answer = mutableListOf<List<Int>>()
    var an = arrayListOf<Int>() //answer의 합저장
    val arr = IntArray(f)
    var visited = BooleanArray(f)
    val input2 = br.readLine().split(" ")
    for (i in 0 until f) {
        arr[i] = input2[i].toInt()
    }
    combination(answer,arr,visited,0,f,3)

    while (true) {
        if (k == answer.size) {
            break
        } else {
            an.add(answer[k].sum())
            k++
        }
    }
    var p = 0
    var isfullsize = true
    while (isfullsize) {
        if (p == answer.size) {
            isfullsize = false
        } else {
            val t = an[p]
            if (t <= s) {
                if (max <= t) {
                    max = t
                }
            }
        }
        p++
    }
    if (p == answer.size) {
        val tk = an[p-1]
        if (tk <= s) {
            if (max <= tk) {
                max = tk
            }
        }
    }
    println(max)
}
