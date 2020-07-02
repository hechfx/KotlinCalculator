package me.hechfx.kotlin.calculator.project

import java.util.*

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Insira um número: ")
        val scanner = Scanner(System.`in`)
        val value = scanner.nextLong()

        println("Qual operação?")
        val scanner2 = Scanner(System.`in`)
        val value2 = scanner2.nextLine()

        val type = Calculator.OperationType.values().filter {
            it.operation.equals(value2, ignoreCase = true)
        }.firstOrNull() ?: return println("Você precisa inserir uma operação válida!")

        println("Por quanto?")
        val scanner3 = Scanner(System.`in`)
        val value3 = scanner3.nextLong()

        println("Resultado: ${Calculator().execute(type, value, value3)}")
    }
}