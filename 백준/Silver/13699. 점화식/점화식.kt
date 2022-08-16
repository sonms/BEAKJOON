fun main() {
    val input = readLine()!!.toInt()
    val t = LongArray(input+1)
    t[0] = 1
    for (i in 1..input) {
        for (j in 0 until i) {
            t[i] += t[j] * t[i-1-j]
        }
    }
    print(t[input])
}