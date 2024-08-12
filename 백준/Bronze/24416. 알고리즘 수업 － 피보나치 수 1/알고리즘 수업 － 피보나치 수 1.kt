fun fib(n : Int) : Int {
    if (n == 1 || n == 2) {
        return 1
    }
    //check += 1
    return fib(n-1) + fib(n-2)
}

fun fibonacci(n : Int) : Int {
    val f = arrayListOf<Long>()
    f.add(0)
    f.add(1)
    f.add(1)
    var cnt = 0

    for (i in 3..n) {
        f.add(f[i-1] + f[i-2])
        cnt += 1
    }
    return cnt
}

fun main() {
    val input = readln().toInt()
    val s1 = fib(input)
    val s2 = fibonacci(input)
    
    print("$s1 $s2")
}