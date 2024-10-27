package com.example.button

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val style = ButtonStyle.buttons
            val randomWidth1 = remember {
                mutableStateOf(style[getRandomNumber()].width)
            }
            val randomBorderColor1 = remember {
                mutableStateOf(style[getRandomNumber()].color)
            }
            val randomColor1 = remember {
                mutableStateOf(style[getRandomNumber()].color)
            }

            val randomWidth2 = remember {
                mutableStateOf(style[getRandomNumber()].width)
            }
            val randomBorderColor2 = remember {
                mutableStateOf(style[getRandomNumber()].color)
            }
            val randomColor2 = remember {
                mutableStateOf(style[getRandomNumber()].color)
            }

            val randomWidth3 = remember {
                mutableStateOf(style[getRandomNumber()].width)
            }
            val randomBorderColor3 =  remember {
                mutableStateOf(style[getRandomNumber()].color)
            }
            val randomColor3 =  remember {
                mutableStateOf(style[getRandomNumber()].color)
            }

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 400.dp), Arrangement.Center
            ) {
                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = {
                        randomWidth2.value = style[getRandomNumber()].width
                        randomBorderColor2.value = style[getRandomNumber()].color
                        randomColor2.value = style[getRandomNumber()].color

                        randomWidth3.value = style[getRandomNumber()].width
                        randomBorderColor3.value = style[getRandomNumber()].color
                        randomColor3.value = style[getRandomNumber()].color
                    },
                    border = BorderStroke(
                        randomWidth1.value,
                        randomBorderColor1.value
                    ),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = randomColor1.value)
                ) {
                    Text(text = "Жми", color = Color.Black)
                }

                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = {
                        randomWidth1.value = style[getRandomNumber()].width
                        randomBorderColor1.value = style[getRandomNumber()].color
                        randomColor1.value = style[getRandomNumber()].color

                        randomWidth3.value = style[getRandomNumber()].width
                        randomBorderColor3.value = style[getRandomNumber()].color
                        randomColor3.value = style[getRandomNumber()].color
                    },
                    border = BorderStroke(
                        randomWidth2.value,
                        randomBorderColor2.value
                    ),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = randomColor2.value)
                ) {
                    Text(text = "Жми", color = Color.Black)
                }

                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = {
                        randomWidth2.value = style[getRandomNumber()].width
                        randomBorderColor2.value = style[getRandomNumber()].color
                        randomColor2.value = style[getRandomNumber()].color

                        randomWidth1.value = style[getRandomNumber()].width
                        randomBorderColor1.value = style[getRandomNumber()].color
                        randomColor1.value = style[getRandomNumber()].color
                    },
                    border = BorderStroke(
                        randomWidth3.value,
                        randomBorderColor3.value
                    ),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = randomColor3.value)
                ) {
                    Text(text = "Жми", color = Color.Black)
                }
                if (
                    randomWidth1 == randomWidth2 && randomWidth1 == randomWidth3 &&
                    randomColor1 == randomColor2 && randomColor1 == randomColor3 &&
                    randomBorderColor1 == randomBorderColor2 && randomBorderColor1 == randomBorderColor3
                    ) Toast.makeText(baseContext, "Поздравляем!!! Вы победили!!!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}

private fun getRandomNumber(): Int{
    val random = Random
    return random.nextInt(0..17)
}




