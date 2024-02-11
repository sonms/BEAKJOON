import java.math.BigInteger

tailrec fun factorial(n: BigInteger, acc: BigInteger): BigInteger {
    return if (n <= BigInteger.ZERO) {
        acc
    } else {
        factorial(n-"1".toBigInteger(), n*acc)
    }
}

fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val nArr = arrayListOf<BigInteger>()

    val temp = n-m

    if (temp > m) {
        var answer = BigInteger.ONE
        for (i in temp+1 .. n) {
            nArr += i.toBigInteger()
        }
       // println("1"+nArr)
        for (j in nArr.indices) {
            answer *= nArr[j]
            //println(nArr[j])
           // println(answer)
        }
        answer /= factorial(m.toBigInteger(), BigInteger.ONE)
        /*println("m"+factorial(m,1L))*/
        println(answer)
    } else {
        var answer = BigInteger.ONE
        for (i in m+1 .. n) {
            nArr += i.toBigInteger()
        }
        //println("2"+nArr)
        for (j in nArr.indices) {
            answer *= nArr[j]
            //println(answer)
        }
        answer /= factorial(temp.toBigInteger(), BigInteger.ONE)
        println(answer)
    }


}