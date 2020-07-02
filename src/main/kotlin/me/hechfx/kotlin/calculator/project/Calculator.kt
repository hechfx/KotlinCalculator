package me.hechfx.kotlin.calculator.project

class Calculator{

    fun execute(type: OperationType, number: Number, target: Number): Number = when (type) {
        OperationType.ADD -> number.toLong() + target.toLong()
        OperationType.REMOVE -> number.toLong() - target.toLong()
        OperationType.MULTIPLY -> number.toLong() * target.toLong()
        OperationType.DIVIDE -> number.toLong() / target.toLong()
    }

    enum class OperationType(val operation: String) {

        ADD("adicionar"),
        REMOVE("subtrair"),
        MULTIPLY("multiplicar"),
        DIVIDE("dividir")

    }

}