import kotlin.math.min

fun main() {
    val input = readln().toInt() //23
    val stick = arrayListOf<Int>()
    var temp2 = 0
    stick.add(64)

    while (stick.sum() > input) { //이 조건이 참인경우 반복

        val min = stick.minOrNull()!!
        if (min == 0) {
            break
        }

        if (stick.filter { it == stick.minOrNull() }.size >= 2) {
            //두개중하나를 가져와서 살리기
            val temp = stick.minOrNull()!!
            stick.removeIf { it == stick.minOrNull() }
            stick.add(temp)
        } else {
            stick.removeIf { it == stick.minOrNull() }
        }

        val half = min / 2 //8
        val half2 = min / 2 //8

        if (half == 0 || half2 == 0) {
            break
        }

        temp2 = half2
        if (half > input) {
            if (stick.sum() + half > input) {
                temp2 = 0
                stick.add(half)
            } else {
                stick.add(half)
                stick.add(temp2)
            }
        } else {
            if (stick.sum() + half > input) {
                stick.add(half)
            } else {
                stick.add(half)
                stick.add(temp2)
            }
        }
    }
    
    print(stick.size)

}