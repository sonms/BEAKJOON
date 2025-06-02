val br = System.`in`.bufferedReader()

fun main() {
   val n = br.readLine().toInt()
   val nArr = br.readLine().split(" ").map { it.toInt() }

   val m = br.readLine().toInt()
   val mArr = br.readLine().split(" ").map { it.toInt() }

   val sort = nArr.sorted()

   for (i in mArr) {
      val exists = binarySearch(sort, i, 0, n - 1)
      println(if (exists) 1 else 0)
   }
}

fun binarySearch(arr: List<Int>, target: Int, low: Int, high: Int): Boolean {
   var l = low
   var h = high
   while (l <= h) {
      val mid = (l + h) / 2
      when {
         arr[mid] == target -> return true
         arr[mid] > target -> h = mid - 1
         else -> l = mid + 1
      }
   }
   return false
}