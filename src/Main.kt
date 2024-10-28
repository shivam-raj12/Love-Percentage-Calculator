import kotlin.random.Random

fun main() {
    print("Enter your name: ")
    val name = readln()
    print("Enter your crush's name: ")
    val crushName = readln()
    println("Calculating Love Percentage...")
    Thread.sleep(Random.nextLong(500, 2500))
    println("$name loves $crushName : ${calculateLove(name, crushName)}%")
    println("$crushName loves $name : ${calculateLove(crushName, name)}%")
}