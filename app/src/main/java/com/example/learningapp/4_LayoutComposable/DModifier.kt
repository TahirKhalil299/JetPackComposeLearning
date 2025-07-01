package com.example.learningapp.`4_LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//Modifier are available in Jetpack Compose to modify the appearance or behavior of Composable functions.like text, image, button, etc.

@Composable
fun ModifierExample() {

    Box(
        modifier = Modifier
            .size(500.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    )
    {

        Text(
            "Hello",
            modifier = Modifier
                .background(Color.Green)
                .padding(10.dp),
            fontSize = 30.sp,
        )


    }

}

@Preview(showSystemUi = true)
@Composable
private fun Show2() {

    // lazyColumnExample()
    ModifierExample()
}


