package com.example.learningapp.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


//Filled Button

@Composable
fun FilledButtonSample() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Button(onClick = {
            Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
        })
        {
            Text("Filled Button")

        }
    }

}


//Tonal Button
@Composable

fun TonalButtonSample() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        FilledTonalButton(onClick = {
            Toast.makeText(context, "Tonal Button Clicked", Toast.LENGTH_SHORT).show()
        })
        {
            Text("Tonal Button")

        }
    }

}


//Outline Button
@Composable
fun OutlineButtonSample() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        OutlinedButton(onClick = {
            Toast.makeText(context, "Outline Button Clicked", Toast.LENGTH_SHORT).show()
        })
        {
            Text("Outline Button")

        }
    }

}


//Elevated Button'
@Composable
fun ElevatedButtonSample() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        ElevatedButton(onClick = {
            Toast.makeText(context, "Elevated Button Clicked", Toast.LENGTH_SHORT).show()
        })
        {
            Text("Elevated Button")

        }
    }
}


//Text Button
@Composable
fun TextButtonSample() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        TextButton(onClick = {
            Toast.makeText(context, "Text Button Clicked", Toast.LENGTH_SHORT).show()
        })
        {
            Text("Text Button")

        }
    }

}


@Preview(showSystemUi = true)
@Composable
private fun ShowButton() {

    //  FilledButtonSample()
    // TonalButtonSample()
    // OutlineButtonSample()
    // ElevatedButtonSample()
    TextButtonSample()

}