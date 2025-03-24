fun main() {
    val (a, b) = readln().split(" ")
    var min = a.length
    
    for (i in 0..b.length - a.length) {
        val subB = b.substring(i, i + a.length)
        var diff = 0
        
        for (j in a.indices) {
            if (a[j] != subB[j]) {
                diff++
            }
        }
        
        min = minOf(min, diff)
    }

    println(min)
}