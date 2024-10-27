package com.example.button

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class ButtonStyle(val width: Dp, val color: Color) {
    companion object{
        val buttons = listOf(
            ButtonStyle(2.dp,Color.White),
            ButtonStyle(2.dp,Color.Magenta),
            ButtonStyle(2.dp,Color.Cyan),
            ButtonStyle(2.dp,Color.LightGray),
            ButtonStyle(2.dp,Color.Blue),
            ButtonStyle(2.dp,Color.Green),
            ButtonStyle(4.dp,Color.White),
            ButtonStyle(4.dp,Color.Magenta),
            ButtonStyle(4.dp,Color.Cyan),
            ButtonStyle(4.dp,Color.LightGray),
            ButtonStyle(4.dp,Color.Blue),
            ButtonStyle(4.dp,Color.Green),
            ButtonStyle(6.dp,Color.White),
            ButtonStyle(6.dp,Color.Magenta),
            ButtonStyle(6.dp,Color.Cyan),
            ButtonStyle(6.dp,Color.LightGray),
            ButtonStyle(6.dp,Color.Blue),
            ButtonStyle(6.dp,Color.Green)
        )
    }
}