//package com.example.myapplication
//
//fun main() {
//    var num1 = readLine()!!.toInt()
//    var operator = readln()
//    var num2 = readLine()!!.toInt()
//    var sum = 0
//    var subtraction = 0
//    var multiple = 0
//    var division = 0
//    var remainder = 0
//
//    var inputOperator:Char = operator[0]
//
//    if(inputOperator== '+') {
//        sum = num1+num2
//        print("연산 값은 ${sum}입니다")
//    } else if(inputOperator=='-') {
//        // 뺼셈일 때
//        subtraction = num1-num2
//        print("연산 값은 ${subtraction}입니다")
//    } else if(inputOperator=='*') {
//        // 곱셈일 때
//        multiple = num1*num2
//        print("연산 값은 ${multiple}입니다")
//    } else if(inputOperator=='/') {
//        // 나눗셈일 때
//        division = num1/num2
//        print("연산 값은 ${division}입니다")
//    } else if(inputOperator=='%') {
//        // 나머지일 때
//        remainder = num1%num2
//        print("연산 값은 ${remainder}입니다")
//    }
//    else {
//        // 잘못된 연산자 일 때
//    }
//}

package com.example.myapplication

class Calculator(private val number1: Double,private val number2: Double){

    fun add(): Double{
        return number1 + number2
    }

    fun suntraction(): Double{
        return number1 - number2
    }

    fun multiple(): Double{
        return number1 * number2
    }

    fun division(): Double{
        return number1 / number2
    }

    fun remainder(): Double{
        return number1 % number2
    }


}
fun main() {

    val num1 = 15.0
    val num2 = 5.0
    val calculator = Calculator(num1, num2)

    print("덧셈값: ${calculator.add()}")
    print("뺄셈값 ${calculator.suntraction()}")
    print("곱셈값 ${calculator.multiple()}")
    print("나눗셈 결과: ${calculator.remainder()}")
}