fun binarySearch(arr : List<Int>, find :Int, low : Int, high : Int ):Int {
   var low = low
   var high = high
   var mid = 0
   while (low <= high) {
      mid = (low+high) / 2
      when{
         arr[mid] == find->return 1
         arr[mid] > find->high = mid - 1
         else -> low = mid + 1
      }
   }
   return 0
}
fun main() {
   val input = readLine()!!.toInt()
   var arr = arrayListOf<Int>()
   val re = arrayListOf<Int>()
   val a = readLine()!!.split(" ")
   for (i in 0 until input) {
      val t = a[i].toInt()

      arr.add(t)
   }
   val inp = readLine()!!.toInt()
   val m = readLine()!!.split(" ")
   for (j in 0 until inp) {
      val c = m[j].toInt()

      re.add(c)
   }
   val sort = arr.sorted().toMutableList()
   for (k in 0 until inp) {
      var check = re[k]
      var result = binarySearch(sort,check,0,input-1)
      println(result)
   }
   /*for (j in 0 until inp) {
      val check = m[j].toInt()
      if (arr.contains(check)) {
         re.add(1)
      } else {
         re.add(0)
      }
   }*/
   /*val sort = arr.sorted()
   var low = 0
   var high = arr.maxOrNull()!!
   var mid = 0
   var target = 0
   while (low <= high) {
      mid = (low + high) / 2
      when{
         arr[mid] == target -> mid
         arr[mid] > target -> high = mid - 1
         else -> low = mid+1
      }
   }
   re.forEach {
      println(it)
   }*/
}