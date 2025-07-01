package com.example.learningapp.`2_FundanmentalConcept`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//Q-What is Composable Function ??
// A Composable function is a function that can be used to define a part of the UI in Jetpack Compose.

//Q-what is preview in compose?
// A preview is a way to visualize a Composable function without running the app on a device or emulator.

@Composable
fun Greeting() {
    Text("Hello, World!")

}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting()

}