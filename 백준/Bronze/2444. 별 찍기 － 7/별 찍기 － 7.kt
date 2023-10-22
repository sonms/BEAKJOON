fun main() {
    val input = readLine()!!.toInt()
    val line = 2 * input - 1
    var star = 0
    var arr = ArrayList<String>()

    for (i in 1 .. input) {
        star = 2 * i - 1
        for (j in 0 until (input - i)) {
            arr.add(" ")
        }
        for (k in 0 until star) {
            arr.add("*")
        }
        arr.add("\n")

        if (i == line -1) {
            star *= 0
        }
    }

    for (i in input-1 downTo 1) {
        star = 2 * i - 1
        for (j in 0 until (input - i)) {
            arr.add(" ")
        }
        for (k in 0 until star) {
            arr.add("*")
        }
        arr.add("\n")
    }

    arr.forEach {
        print(it)
    }
}