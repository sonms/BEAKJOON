fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var rectangle = ""
    repeat(a) {
        rectangle += "*"
    }
    repeat(b) {
        println(rectangle)
    }
}