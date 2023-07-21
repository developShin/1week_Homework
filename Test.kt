class Calculator(private val number1: Double, private val number2: Double) {
    // 덧셈 연산
    fun add(): Double {
        return number1 + number2
    }

    // 뺄셈 연산
    fun subtract(): Double {
        return number1 - number2
    }

    // 곱셈 연산
    fun multiply(): Double {
        return number1 * number2
    }

    // 나눗셈 연산
    fun divide(): Double {
        if (number2 == 0.0) {
            throw IllegalArgumentException("나누는 수는 0이 될 수 없습니다.")
        }
        return number1 / number2
    }
}

fun main() {
    val num1 = 10.0
    val num2 = 5.0

    val calculator = Calculator(num1, num2)

    println("덧셈 결과: ${calculator.add()}")
    println("뺄셈 결과: ${calculator.subtract()}")
    println("곱셈 결과: ${calculator.multiply()}")
    try {
        println("나눗셈 결과: ${calculator.divide()}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}