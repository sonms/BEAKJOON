import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val arr = IntArray(n)
    var cnt = 0 //갑옷개수
    val ingredient = br.readLine().split(" ").toList()
    for (i in ingredient.indices) {
        arr[i] = (ingredient[i].toInt())
    }
    for (i in arr.indices) {
        for (j in i+1 until arr.size) {
            if (arr[i] + arr[j] == m) {
                cnt ++
                break
            }
        }
    }
    print(cnt)
}