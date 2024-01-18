fun main() {
    val input = readln()
    var cntChange1 = 0
    var cntChange0 = 0
    var temp = 0
    temp = input[0].toString().toInt()
    if (temp == 1) {
        cntChange1++
    } else {
        cntChange0++
    }
    for (i in input.indices) {
        if (temp != input[i].toString().toInt()) {
            if (input[i].toString().toInt() == 1) {
                temp = input[i].toString().toInt()
                cntChange1++
            } else {
                temp = input[i].toString().toInt()
                cntChange0++
            }
        }
    }
    
    val answer = if (cntChange0 > cntChange1) {
        cntChange1
    } else if (cntChange0 < cntChange1) {
        cntChange0
    } else {
        cntChange0
    }

    print(answer)
}