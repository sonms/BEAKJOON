fun main() {
    val a = readln().toString()
    val b = readln().toString()
    val nums = IntArray(a.length + b.length)

    for (i in a.indices) {
        nums[2*i] = a[i].toString().toInt()
        nums[2*i+1] = b[i].toString().toInt()
    }
    /*nums.forEach {
        print(it)
    }*/

    //val dp = IntArray(a.length+b.length) {0}

    var i = 0
    var j = nums.lastIndex
    //println("j" + j)
    while (j != 1) {
        if (i == j) {
            /*println("end")
            val resultString = nums.joinToString(" ")
            println(resultString)*/
            j -= 1
            i = 0
        } else {
            nums[i] = (nums[i] + nums[i+1]) % 10
            //println("i"+i + "#"+nums.iterator().next())
            i++
        }
    }

    print(nums[0].toString()+nums[1].toString())
}