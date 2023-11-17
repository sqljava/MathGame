package uz.ictschool.mathgame.screens

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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


@Preview(showBackground = true)
@Composable
fun GameScreen(){

    var num by remember {
        mutableStateOf(0)
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(vertical = 100.dp),
        contentAlignment = Alignment.TopCenter,

    ){

        Column {
            Text(text = "2 [ $num ] 3",
                fontSize = 20.sp)

            Button(onClick = {
                num = (1 until 9).random()
                randomNumber = num
                Log.d("TAG", "GameScreen: $randomNumber")
            },
                modifier = Modifier.padding(10.dp)) {
                Text(text = "random")
            }
        }


    }

}