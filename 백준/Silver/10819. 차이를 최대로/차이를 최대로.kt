import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n) { scanner.nextInt() }

    val visited = BooleanArray(n) { false }
    val permutation = IntArray(n)
    var maxSum = Int.MIN_VALUE

    fun calculateSum() {
        var sum = 0
        for (i in 0 until n - 1) {
            sum += kotlin.math.abs(permutation[i] - permutation[i + 1])
        }
        maxSum = kotlin.math.max(maxSum, sum)
    }

    fun generatePermutation(depth: Int) {
        if (depth == n) {
            calculateSum()
            // 생성된 순열 출력
            /*for (element in permutation) {
                print("$element ")
            }
            println(maxSum)
            println()*/ // 줄바꿈
            return
        }
        for (i in arr.indices) {
            if (!visited[i]) {
                visited[i] = true
                permutation[depth] = arr[i]
                generatePermutation(depth + 1)
                visited[i] = false
            }
        }
    }

    generatePermutation(0)
    println("$maxSum")
}