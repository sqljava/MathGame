package uz.ictschool.mathgame

import uz.ictschool.mathgame.model.Problem

class Logic() {
    var signs = listOf("+","-","*","/")

    fun random(maxInt: Int):Problem{
        var num1 = (0 until maxInt).random()
        var num2 = (0 until maxInt).random()
        var answer = signs.random()

        if (answer == "/") {
            while (num1 % num2 != 0 || num2 == 1) {
                num1 = (1 until 9).random()
                num2 = (1 until 9).random()
            }
        }

        var question = "$num1 [?] $num2 = ${calculate(num1, num2, answer)}"

        var problem = Problem(question, answer)

        return problem
    }

    fun calculate(num1:Int, num2: Int, ans: String):Int{

        return when(ans){
        "+"->num1 + num2
        "-"->num1-num2
        "*"->num1 * num2
        "/"->num1 / num2
            else -> {
                5
            }
        }
    }
}