import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    //teste()

    val testeD = launch {
        delay(2000)
        println("Teste de doido")
    }

    println("Esperando o ")
    testeD.join()
    println("Concluido")

}

suspend fun teste() = coroutineScope {
    launch {
        delay(1000)
        println("Mundo")
    }

    launch {
        delay(3000)
        println("Do carai")
    }
    println("Olá")
}

