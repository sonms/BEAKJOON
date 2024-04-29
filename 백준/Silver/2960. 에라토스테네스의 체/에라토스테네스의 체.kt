import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var answer = 0
fun isPrime(booleanArray: BooleanArray, n : Int, k : Int) {
    var cnt = 0
    var isBreak = false
    for (i in 2..n) {
        if (booleanArray[i]) {
            continue
        } else {
            cnt+= 1
            booleanArray[i] = true
        }
        //println("$cnt, $i")
        for (j in i..n step i) {
            //println("$cnt $j")
            if (booleanArray[j]){
                /*println("a")
                println("$cnt $j")*/
                if (cnt == k) {
                    answer = j
                    isBreak = true
                    break
                }
                continue
            } else if (!booleanArray[j]){
                cnt += 1
                booleanArray[j] = true
                //println("$cnt $j b")
            }

            if (cnt == k) {
                answer = j
                isBreak = true
                break
            }
        }

        if (isBreak) {
            break
        }
    }
    //println(booleanArray.contentToString())
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,k) = br.readLine().split(" ").map { it.toInt() }
    val booleanArray = BooleanArray(n.toInt()+1){false}
    booleanArray[0] = true
    booleanArray[1] = true
    isPrime(booleanArray, n, k)
    println(answer)
}