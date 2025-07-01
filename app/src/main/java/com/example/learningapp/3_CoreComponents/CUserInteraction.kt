package com.example.learningapp.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.sync.Mutex


@Composable
fun PartialSelectableText() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        SelectionContainer {

            Column() {

                Text("This is the text")
                Text("This is the text 2")
                Text("This is the text 3")
                Text("This is the text 4")
                Text("This is the text 5 ")
                DisableSelection {

                    Text("This text is not selectable")
                    Text("This text is not selectable 2")

                }


            }

        }
    }


}



@Composable
fun AnnotatedStringWithListenerSample() {
    val uriHandler = LocalUriHandler.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            buildAnnotatedString {
                append("Click here to visit ")

                val link = LinkAnnotation.Url(
                    url = "https://www.google.com",
                    styles = TextLinkStyles(
                        style = SpanStyle(color = Color.Blue)
                    )
                ) { linkAnnotation ->
                    val url = (linkAnnotation as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }

                withLink(link) {
                    append("Google")
                }
            }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
private fun Preview() {

    // PartialSelectableText()
    AnnotatedStringWithListenerSample()
}

