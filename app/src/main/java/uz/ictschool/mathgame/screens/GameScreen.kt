package uz.ictschool.mathgame.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private var randomNumber = 0







fun random():String{
    randomNumber = (1 until 9).random()

    var num1 = (1 until 9).random()
    var num2 = (1 until 9).random()
    var signs = listOf("+","-","*","/")
    var answer = signs.random()

    if (answer == "/"){
        while (num1 % num2 != 0){
            num1 = (1 until 9).random()
            num2 = (1 until 9).random()
        }
    }

     var question = "$num1 _ $num2 = ${calculate(num1, num2, answer)}"
    return question
}

fun calculate(num1 : Int, num2: Int, sign: String): Int{
    return when(sign){
        "+"->num1 + num2
        "-"->num1-num2
        "*"->num1 * num2
        "/"->num1 / num2
        else -> {
            5
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GameScreen(){

    var num by remember {
        mutableStateOf(0)
    }

    var question by remember {
        mutableStateOf(random())
    }

    random()

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center,

    ){

        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = question,
                fontSize = 20.sp)

//            Button(onClick = {
//                num = (1 until 9).random()
//                randomNumber = num
//                Log.d("TAG", "GameScreen: $randomNumber")
//            },
//                modifier = Modifier.padding(10.dp)) {
//                Text(text = "random")
//            }



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.Center) {
                Button(onClick = {
                    random()
                    Log.d("TAG", "GameScreen: $randomNumber")
                }) {
                    Text(text = "+")

                }
                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "-")

                }

            }

            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "*")

                }
                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "/")

                }

            }
        }


    }

}