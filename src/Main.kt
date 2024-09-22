fun main() {
    print("число a: ")
    val a = readLine()!!.toInt()

    print("число b: ")
    val b = readLine()!!.toInt()

    // проверка является ли a делителем b
    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}
