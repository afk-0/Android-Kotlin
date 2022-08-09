import java.util.Scanner

fun main (args : Array<String>){
    var scanner = Scanner(System.`in`)

    var size = scanner.nextLine().trim().toInt()
    var ar = scanner.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    var sum : Long = 0

    for (x in ar)
    {
        sum = sum + x
    }

    println(sum)
}
