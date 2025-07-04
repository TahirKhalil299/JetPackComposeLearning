package com.example.learningapp.`10_FloatingButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningapp.`9_AlertDialogBox`.DialogWithImage

@Composable
fun FloatingButtonExample() {


    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {

        ExtendedFloatingActionButton(
            onClick = {
                // Add your click action here
            }
        ) {
            Text("This is extended button")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DialogWithImagePreview() {
    FloatingButtonExample()
}