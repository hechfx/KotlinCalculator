package src.main.kotlin

class Calculator(val x: Long){
    fun add(y: Long): Long = x + y
    fun multiply(y: Long): Long = x * y
    fun subtract(y: Long): Long = x - y
    fun divide(y: Long): Long = x / y
}