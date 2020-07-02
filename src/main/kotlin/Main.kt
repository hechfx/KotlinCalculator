package src.main.kotlin
import java.util.*

class Main(args: Array<String>) {

    companion object {


        @JvmStatic fun main(args: Array<String>) {
            println("Insira um número: ");
            val scanner = Scanner(System.`in`);
            val value = scanner.nextLong();

            println("Qual operação?")
            val scanner2 = Scanner(System.`in`);
            val value2 = scanner2.nextLine()

            println("Por quanto?")
            val scanner3 = Scanner(System.`in`);
            val value3 = scanner3.nextLong();

            when {
                value2 == "dividir" -> println("Resultado: ${Calculadora(value).dividir(value3)}")
                value2 == "multiplicar" -> println("Resultado: ${Calculadora(value).multiplicar(value3)}")
                value2 == "adicionar" -> println("Resultado: ${Calculadora(value).adicionar(value3)}")
                value2 == "subtrair" -> println("Resultado: ${Calculadora(value).subtrair(value3)}")
            }

        }
    }
}