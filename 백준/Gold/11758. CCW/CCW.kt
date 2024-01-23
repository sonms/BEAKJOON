fun ccw(x1 : Int, x2 : Int, x3 : Int, y1 : Int, y2 : Int, y3 : Int) : Int{
    //백터의 외적을 진행 이때 2차원이므로 z좌표는 0을 넣고 진행
    //행렬을 사용하여 외적을 진행하면 CA백터 와 AB백터의 외적은 (0, 0, ad-bc)가 된다
    //이때 ad-bc => (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)가된다
    //이때 양수면 반시계, 음수이면 시계, 0이면 일직선인것을 파악할 수 있다
    return (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)
}

fun main() {
    val p1 = readln().split(" ").map { it.toInt() }
    val p2 = readln().split(" ").map { it.toInt() }
    val p3 = readln().split(" ").map { it.toInt() }

    val answer = ccw(p1[0], p2[0], p3[0], p1[1], p2[1], p3[1])

    if (answer > 0) { //반시계
        print(1)
    } else if (answer == 0) {//일직선
        print(0)
    } else {
        print(-1)
    }
}