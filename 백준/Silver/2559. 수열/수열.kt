fun main() { 
    //슬라이싱 윈도우 기법
    //만약 123456에서 3개씩더한다 생각
    //123, 234, ...일때
    //처음 123을 구하면 234는 123 - 1 + 4인 규칙성을 가진다
    val input = readLine()!!.split(" ").map { it.toInt() }
    val temperatureData = readLine()!!.split(" ").map { it.toInt() }

    var sum = temperatureData.take(input[1]).sum() //처음 123느낌을 구함
    var maxSum = sum

    for (i in 1..(input[0] - input[1])) {
        // 현재 윈도우의 합 계산
        //처음 123 - 1(첫인덱스) + 4(마지막 인덱스)
        sum = sum - temperatureData[i - 1] + temperatureData[i + input[1] - 1]

        // 최댓값 갱신
        maxSum = maxSum.coerceAtLeast(sum)
    }

    println(maxSum)
}