import kotlin.math.max

fun gcd(a:Int, b:Int) : Int {
    return if (b == 0) {
        max(a,b)
    } else {
        gcd(b,a%b)
    }
}

fun main() {
    val input = readLine()!!.toInt()
    val answer = arrayListOf<String>()
    val sb = StringBuilder()
    val arr = IntArray(input)
    val temp = readLine()!!.split(" ")
    for (i in 0 until input) {
        arr[i] = temp[i].toInt()
    }

    val f = arr[0] //8
    for (i in 1 until arr.size) {
        if(f % arr[i] == 0) {//나누어떨어지면
            val denominator = f / arr[i] //분모
            val numerator = 1
            answer.add("${denominator}/${numerator}")
        } else {
            val gcd = gcd(f,arr[i])
            val d = f/gcd
            val n = arr[i] / gcd
            answer.add("${d}/${n}")
        }
    }

    answer.joinToString("\n","","").forEach {
        sb.append(it)
    }
    print(sb)
}