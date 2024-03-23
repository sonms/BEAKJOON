import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun subtractCounts(map1: Map<Char, Int>, map2: Map<Char, Int>, diff : Int): Map<Char, Int> {
    val result = LinkedHashMap<Char, Int>(map1)
    // 두 맵의 크기 차이가 2 이상인 경우에는 결과에 추가하지 않음
    //println("abs" + abs(map1.size - map2.size))
    if (diff >= 2) {
        return result
    }
    for ((char, count) in map2) {
        result[char] = abs(result.getOrDefault(char, 0) - count)
    }

    // 결과가 0인 항목은 삭제
    //result.entries.removeIf { it.value == 0 }
    return result
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val firstWord = br.readLine()
    var result = 0
    val firstWordCntHm = LinkedHashMap<Char, Int>() //들어있는 char와 갯수
    //val answerTest = ArrayList<String>()

    for (ch in firstWord) {
        firstWordCntHm[ch] = firstWordCntHm.getOrDefault(ch, 0) + 1
    }
    //println("cnt " + firstWordCntHm)

    repeat(n - 1) {
        val word = br.readLine()
        val wordCntHm = LinkedHashMap<Char, Int>()
        for (i in word.toMutableList()) { //D,O,G
            wordCntHm[i] = word.count { it == i }
        }

        //println(wordCntHm)
        /*println(firstWordCntHm.size)
        println(wordCntHm.size)*/
        //println("fW"+abs(firstWordCntHm.size - wordCntHm.size))
        val diff = abs(firstWord.length - word.length)
        val s = subtractCounts(firstWordCntHm, wordCntHm, diff)

        //println("s"+s)
        //println("sSS"+ s.filter { it.key != s.keys.first() })
        if (s.filter { it.value >= 1 }.values.size <= 2 && s.filter { it.value >= 2 }.values.isEmpty() && s.isNotEmpty()) {
            //answerTest.add(word)
            result += 1
        }
        //val remainingWord = word.toMutableList()
        //val isContained = abs(firstWord.length - word.length) <= 1

        /*if (isContained) {
            println(isContained)
            var countChar = 0
            val cntList = arrayListOf<Int>()
            for ((key, value) in cnt) { //D,O,G
                countChar = word.count { it == key }
                cntList.add(countChar)
            }
            println("cntList" + cntList)

            cnt.onEachIndexed { index, entry ->
                if (cntList[index] == entry.value || cntList[index] == entry.value - 1 || cntList[index] == entry.value + 1) {
                    println(entry.value)
                    answerTest.add(word)
                    result += 1
                }
            }
            *//*for (j in cntList.indices) {
                if (cntList[j] == cnt[j] || cntList[j] == cnt[j].second - 1 || cntList[j] == cnt[j].second + 1) {
                    answerTest.add(word)
                    result += 1
                }
            }*//*
        }
    }*/
        //println(result)
        //println(answerTest)
    }
    println(result)
}