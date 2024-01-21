//data class Triple2<T, U, V>(var first : Int, var second : Int, var third : Int)

fun main() {
    val inputN = readln().toInt()
    val inputAData = readln().split(" ").map { it.toInt() }
    //원래 배열의 인덱스,p의 값 0,1,2를 붙혀줌,배열의 원소
    //그리고 다시 원상태로 돌리면 원하는 p의 수열을 얻을 수 있음
    //a배열 생성
    //->원래 배열의 인덱스변수,p의 값 0,1,2를 붙혀주기위한변수,배열의 원소변수순으로생성
    //->원래 배열의 인덱스와 배열의 원소를 할당
    //-> 내림차순
    //-> p의 값도이제 할당
    //-> 원상태 복귀
    //-> second값 출력
    val arrA = arrayListOf<Triple<Int, Int, Int>>()

    for (j in inputAData.indices) {
        arrA.add(Triple(j, 0, inputAData[j]))
    }
    //val anotherPair = pair.copy(first = "I am new String")
    arrA.sortBy { it.third }
    for (k in arrA.indices) {
        arrA[k] = arrA[k].copy(second = k)
    }
    arrA.sortBy { it.first }

    print(arrA.joinToString(" ") {
        it.second.toString()
    })
}