import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    var input = readln().toString()
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val answer = StringBuilder()

    if (!input.contains("<")) {
        val temp = input.split(" ").map { it.toString() }
        for (i in temp.indices) {
            answer.append(temp[i].reversed() + " ")
        }
        println(answer)
    } else {
        /*val input = "<   space   >space space space<    spa   c e>"*/
        //var answer = ""

        var insideTag = false
        var currentWord = StringBuilder()

        for (i in input.indices) {
            //println(input[i])
            if (input[i].toString() == "<") {
                insideTag = true
                if (currentWord.isNotBlank()) {
                    //println("cu" +currentWord )
                    if (currentWord.contains(" ")) {
                        //println("it")
                        val temp = currentWord.split(" ").map { it }
                        for (k in temp.indices) {
                            answer.append(temp[k].reversed()).append(" ")
                        }
                        //println("reverse")
                        answer.deleteCharAt(answer.length - 1)
                    } else {
                        //println("non")
                        //println(currentWord)
                        answer.append(currentWord.reversed())
                    }
                    currentWord.clear()
                }
            } else if (input[i].toString() == ">") {
                insideTag = false
                answer.append("<$currentWord>")
                //println("none")
                currentWord.clear()
            } else {
                currentWord.append(input[i])
            }
        }

        //마지막에 있는 거 체크 <>아닌거
        if (currentWord.isNotBlank()) {
            if (insideTag) {
                answer.append("<$currentWord>")
            } else {
                //println("??")
                if (currentWord.contains(" ")) {
                    //println("it")
                    val temp = currentWord.split(" ").map { it }
                    for (k in temp.indices) {
                        answer.append(temp[k].reversed()).append(" ")
                    }
                    //println("reverse")
                    answer.deleteCharAt(answer.length - 1)
                } else {
                    //println("non")
                    //println(currentWord)
                    answer.append(currentWord.reversed())
                }
            }
        }

        println(answer)
    }
    //println(answer)
}