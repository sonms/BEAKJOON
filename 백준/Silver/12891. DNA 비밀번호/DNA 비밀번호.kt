val br = System.`in`.bufferedReader()

fun main() {
    val (S, P) = br.readLine().split(" ").map { it.toInt() }

    val dna = br.readLine().toString()

    val (A,C,G,T) = br.readLine().split(" ").map { it.toInt() }

    var answer = 0
    val count = IntArray(4)

    //초기 슬라이딩 윈도우 세팅
    for (i in 0 until P) {
        add(dna[i], count)
    }
    if (isValid(count,A,C,G,T)) {
        answer += 1
    }

    for (j in P until S) {
        remove(dna[j - P], count)
        add(dna[j], count)
        if (isValid(count,A,C,G,T)) {
            answer += 1
        }
    }

    //연속된 부분 문자열의 길이를 구하기 위해 슬라이딩윈도우 기법 사용
    //카운트 하여 최소 갯수 만족하는지 판단

    /*val answer = dna.windowed(size = P)
        .count { window ->
            val aCount = window.count { it == 'A' }
            val cCount = window.count { it == 'C' }
            val gCount = window.count { it == 'G' }
            val tCount = window.count { it == 'T' }

            aCount >= A && cCount >= C && gCount >= G && tCount >= T
        }*/



    print(answer)
}

fun add(c: Char, count: IntArray) {
    when (c) {
        'A' -> count[0]++
        'C' -> count[1]++
        'G' -> count[2]++
        'T' -> count[3]++
    }
}

fun remove(c: Char, count: IntArray) {
    when (c) {
        'A' -> count[0]--
        'C' -> count[1]--
        'G' -> count[2]--
        'T' -> count[3]--
    }
}

fun isValid(count : IntArray, a : Int, c : Int, g : Int, t : Int) : Boolean {
    return count[0] >= a && count[1] >= c && count[2] >= g && count[3] >= t
}