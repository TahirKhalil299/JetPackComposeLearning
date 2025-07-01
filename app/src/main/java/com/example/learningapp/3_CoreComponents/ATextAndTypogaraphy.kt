package com.example.learningapp.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningapp.R

@Composable
fun SimpleText() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            "Hello, World!",
            color = colorResource(R.color.orange),
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Gray,
                    blurRadius = 5f
                )
            )


        )
    }

}


@Composable
fun ColorFullText() {

    val rainbowColors = listOf(
        Color.Red, Color.Yellow, Color.Green, Color.Cyan, Color.Blue, Color.Magenta
    )



    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {

        Text(

            text = buildAnnotatedString {
                append("Do not allow people to dim your shin0 \n ")
                withStyle(
                    SpanStyle(brush = Brush.linearGradient(rainbowColors))

                ) {
                    append("because they are blinded.")

                }
                append("\n tell them to put on some sunglasses on.")
            }

        )
    }


}


@Composable
fun BasicScrollableText() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            text = "lor.".repeat(
                50
            ),
            maxLines = 2,
            // modifier = Modifier.basicMarquee(), //this will make the text scrollable
            fontSize = 10.sp,
            overflow = TextOverflow.Ellipsis, //show the text with ellipsis if it overflows
            modifier = Modifier.padding(20.dp)

        )
    }

}


@Preview(showSystemUi = true)
@Composable
private fun showText() {
    //  SimpleText()
    // ColorFullText()
    BasicScrollableText()
}