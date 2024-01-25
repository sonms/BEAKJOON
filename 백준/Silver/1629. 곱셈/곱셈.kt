
fun pow(x : Long, y : Long, z :Long) : Long{ //10,11,12 분할정복
    var a = x
    var b = y

    var m = 1L

    if (y == 0L) {
        return 1
    }

    if (y == 1L) {
        a %= z
        return a
    }


    while (b > 1) {
        if (b % 2 == 1L) { //홀수이면? 남은 수 곱해서 나머지또 구해줌 ex 10^11 -> 10^10 * 10이면 10남았으니 곱
            //(84^38 * 66) % 89 모듈러 나머지 정리에 의해
            //(A * B) mod C = (A mod C * B mod C) mod C
            //((66^2 % 89)^38 * 66) % 89
            //((84^38 % 89) * (66 % 89)) % 89
            //...
            //((((25^2 % 89)^9 * 25) % 89) * 66) % 89
            //따라서 25와 66을 m에 저장하며 % 89를 해줌으로써 나중에
            //곱셈할 m을 구해준다
            m = (m * a) % z
        }
        //b(지수)를 2를 제외한 너머지 지수를 넘기면서 계산
        //((66^2 % 89)^38 * 66) % 89
        //((((25^2 % 89)^9 * 25) % 89) * 66) % 89와같이
        //따라서 a*a를 해주면서 해줌 이게 앞부분
        a = (a * a) % z
        b /= 2
    }

    return (a * m) % z
}


fun main() {
    val input = readln().split(" ").map { it.toLong() }

    val answer = pow(input[0], input[1], input[2])
    print(answer)
}