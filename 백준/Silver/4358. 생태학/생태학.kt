import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.DecimalFormat


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val hm = HashMap<String, Int>()
    //var df = DecimalFormat("#.####")
    var entireCnt = 0
    //String.format("%.4f", 원하는 값);
    while (true) {
        val temp = br.readLine()
        if (temp.isNullOrEmpty()) {
            break
        }

        if (hm.containsKey(temp)) {
            hm[temp] = (hm[temp] ?: 1) + 1
        } else {
            hm[temp] = 1
        }
        entireCnt += 1
        //println(hm)
    }

    val list: List<String> = ArrayList<String>(hm.keys).sorted()
    for (i in list.indices) {
        val species = list[i]
        //println("s" + species)

        val answer = (hm[species]?.toDouble() ?: 0.0) * 100 / entireCnt.toDouble()
        //println(String.format("$species %.4f\n", answer))
        println(species + " " + String.format("%.4f", answer));
    }
}