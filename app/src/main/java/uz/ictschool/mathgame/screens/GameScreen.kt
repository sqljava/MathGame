package uz.ictschool.mathgame.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ictschool.mathgame.Logic
import uz.ictschool.mathgame.R
import uz.ictschool.mathgame.model.Problem

private var ans = ""

@Preview(showBackground = true)
@Composable
fun GameScreen(){

     var problem = btnClicked("a")

    Log.d("TAG", problem.question)

    var question by remember {
        mutableStateOf(problem.question)
    }

    var answer by remember {
        mutableStateOf(problem.answer)
    }

    ans = answer


    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center,

    ){

        Image(painter = painterResource(id = R.drawable.gamebg),
            contentDescription = "null",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)

        Text(text = question,
            fontSize = 40.sp)

//        Box(modifier = Modifier
//            .fillMaxSize()
//            .padding(20.dp),
//            contentAlignment = Alignment.TopStart
//        ){
//            Text(text = "Score")
//
//        }


        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom) {

            Spacer(modifier = Modifier.height(50.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp, vertical = 20.dp),
                horizontalArrangement = Arrangement.Center) {
                Button(onClick = {
                    var p = btnClicked("+")
                    question = p.question
                    answer = p.answer

                },
                    modifier = Modifier.weight(1f)) {
                    Text(text = "+",
                        fontSize = 25.sp)

                }
                Spacer(modifier = Modifier.width(50.dp))

                Button(onClick = {
                    var p = btnClicked("-")
                    question = p.question
                    answer = p.answer },
                    modifier = Modifier.weight(1f)) {
                    Text(text = "-",
                        fontSize = 25.sp)

                }

            }

            Row(modifier = Modifier
                .padding(horizontal = 50.dp, vertical = 20.dp)) {
                Button(onClick = {
                    var p = btnClicked("*")
                    question = p.question
                    answer = p.answer },
                    modifier = Modifier.weight(1f)) {
                    Text(text = "*",
                        fontSize = 25.sp)

                }
                Spacer(modifier = Modifier.width(50.dp))

                Button(onClick = {
                    var p = btnClicked("/")
                    question = p.question
                    answer = p.answer },
                    modifier = Modifier.weight(1f)) {
                    Text(text = "/",
                        fontSize = 25.sp)

                }
            }
        }
    }
}

fun btnClicked(btnSign: String):Problem{

    if(btnSign == ans){
        Log.d("TAG", "Togri")
    }else if (btnSign == "a"){

    }else{
        Log.d("TAG", "Xato")

    }

    var problem = Logic().random(10)

    Log.d("TAG", problem.question)


    return problem

}