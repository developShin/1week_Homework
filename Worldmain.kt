package com.example.myapplication

fun main() {
    var num1 = readLine()!!.toInt()
    var operator = readln()
    var num2 = readLine()!!.toInt()
    var sum = 0
    var subtraction = 0
    var multiple = 0
    var division = 0
    var remainder = 0

    var inputOperator:Char = operator[0]

    if(inputOperator== '+') {
        sum = num1+num2
        print("연산 값은 ${sum}입니다")
    } else if(inputOperator=='-') {
        // 뺼셈일 때
        subtraction = num1-num2
        print("연산 값은 ${subtraction}입니다")
    } else if(inputOperator=='*') {
        // 곱셈일 때
        multiple = num1*num2
        print("연산 값은 ${multiple}입니다")
    } else if(inputOperator=='/') {
        // 나눗셈일 때
        division = num1/num2
        print("연산 값은 ${division}입니다")
    } else if(inputOperator=='%') {
        // 나머지일 때
        remainder = num1%num2
        print("연산 값은 ${remainder}입니다")
    }
    else {
        // 잘못된 연산자 일 때
    }
}