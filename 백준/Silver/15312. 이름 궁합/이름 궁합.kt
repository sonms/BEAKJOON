import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val aName = br.readLine()//종민
        val bName = br.readLine()//그녀
        val numOfStrokesArray = intArrayOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)
        val arrayOfStrkoes = IntArray(aName.length + bName.length)
    val arr = CharArray(aName.length + bName.length)
        // 일자로 이름 번갈아가면서 세우기
        var i = 0
    var j = 0
    var h = 0
        while (i < arrayOfStrkoes.size - 1) {
            arrayOfStrkoes[i] = numOfStrokesArray[aName[i / 2].code - 65]
            arrayOfStrkoes[i + 1] = numOfStrokesArray[bName[i / 2].code - 65]
            i += 2
        }
    for (p in arrayOfStrkoes.indices) {
        if (p%2 == 0) {
            if (j != aName.length) {
                val c : Char = aName[j]
                arr[p] = c
                j++
            } else {
                continue
            }
        } else {
            if (h != bName.length) {
                val c : Char = bName[h]
                arr[p] = c
                h++
            } else {
                continue
            }
        }
    }
    for (k in arr.indices) {//처음 이름에서 점수로 바꾼 memo배열
        arrayOfStrkoes[k] = numOfStrokesArray[arr[k] - 'A']
    }
        var size = arrayOfStrkoes.size
        while (size > 2) {
            for (l in 0 until size - 1) {
                arrayOfStrkoes[l] = (arrayOfStrkoes[l] + arrayOfStrkoes[l + 1]) % 10
            }
            arrayOfStrkoes[--size] = 0
        }
        println(arrayOfStrkoes[0].toString() + arrayOfStrkoes[1].toString())
    }