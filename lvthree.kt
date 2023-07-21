package com.example.myapplication

class  AddOperation{
    var num1 = 0
    var operator = '+'
    var num2 = 0

    fun sum(){
        print("숫자를 입력하세요:")
        num1 = readLine()!!.toInt()
        print("연산기호를 입력하세요:")
        var operator = readln()
        print("숫자를 입력하세요:")
        num2 = readLine()!!.toInt()
        var inputOperator:Char = operator[0]
        var sum1=num1+num2
        print("결과값은 ${sum1}입니다.")
    }
}
class  SubstractOperation{
    var num1 = 0
    var operator = '-'
    var num2 = 0

    fun subtraction(){
        print("숫자를 입력하세요:")
        num1 = readLine()!!.toInt()
        print("연산기호를 입력하세요:")
        var operator = readln()
        print("숫자를 입력하세요:")
        num2 = readLine()!!.toInt()
        var inputOperator:Char = operator[0]
        var subtraction1=num1-num2
        print("뺄셈결과값은 ${subtraction1}입니다.")
    }
}
class  MultiplyOperation{
    var num1 = 0
    var operator = '-'
    var num2 = 0

    fun multiple(){
        print("숫자를 입력하세요:")
        num1 = readLine()!!.toInt()
        print("연산기호를 입력하세요:")
        var operator = readln()
        print("숫자를 입력하세요:")
        num2 = readLine()!!.toInt()
        var inputOperator:Char = operator[0]
        var multiple1=num1*num2
        print("곱셈결과값은 ${multiple1}입니다.")
    }
}

class  DivideOperation{
    var num1 = 0
    var operator = '-'
    var num2 = 0

    fun division(){
        print("숫자를 입력하세요:")
        num1 = readLine()!!.toInt()
        print("연산기호를 입력하세요:")
        var operator = readln()
        print("숫자를 입력하세요:")
        num2 = readLine()!!.toInt()
        var inputOperator:Char = operator[0]
        var division1=num1/num2
        print("나누기결과값은 ${division1}입니다.")
    }
}

fun main() {
    val addOperation =AddOperation()
    val substractOperation =SubstractOperation()
    val multiplyOperation =MultiplyOperation()
    val divideOperation =DivideOperation()

    addOperation.sum()
    substractOperation.subtraction()
    multiplyOperation.multiple()
    divideOperation.division()



}