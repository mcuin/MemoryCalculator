package com.cuinsolutions.memorycalculator.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cuinsolutions.memorycalculator.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(Modifier.fillMaxWidth()) {
                        NumberEntry()
                    }
                }
            }
        }
    }
}

@Composable
fun NumberEntry() {
    TextField(value = "", onValueChange = {})
}

@Composable
fun NumberButton(number: Int) {
    Button(onClick = { /*TODO*/ }) {
        Text(text = number.toString())
    }
}

@Composable
fun NumberRow(firstNumber: Int, secondNumber: Int, thirdNumber: Int) {
    Row {
        NumberButton(firstNumber)
        NumberButton(secondNumber)
        NumberButton(thirdNumber)
    }
}

@Composable
fun TextButton(text: String) {
    Button(onClick = { /*TODO*/ }) {
        Text(text = text)
    }
}

@Composable
fun DeleteButton() {
    IconButton(onClick = { /*TODO*/ }) {
        Image(painter = , contentDescription = )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
            Column(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()) {
                NumberEntry()
                NumberRow(firstNumber = 7, secondNumber = 8, thirdNumber = 9)
                NumberRow(firstNumber = 4, secondNumber = 5, thirdNumber = 6)
                NumberRow(firstNumber = 1, secondNumber = 2, thirdNumber = 3)
                Row(Modifier.fillMaxSize()) {
                    NumberButton(number = 0)
                    TextButton(text = ".")
                }
            }
    }
}
