import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    println(Ejercicio(10){ Random.nextInt(50,250)}.tablaSiete.contentToString())
}