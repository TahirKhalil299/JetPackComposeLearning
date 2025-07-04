package com.example.learningapp.`9_AlertDialogBox`


import android.widget.Toast
import com.example.learningapp.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.window.Dialog
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.material3.TextButton
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun DialogWithImage(
    onDismissRequest: () -> Unit
) {
    val context = LocalContext.current

    Dialog(
        onDismissRequest = onDismissRequest
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_handshake),
                    contentDescription = "Dialog image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(160.dp)
                        .padding(top = 16.dp)
                )

                Text(
                    text = "This is the dialog",
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    TextButton(
                        onClick = {
                            Toast.makeText(context, "Confirmed!", Toast.LENGTH_SHORT).show()
                            onDismissRequest()
                        }
                    ) {
                        Text(text = "Confirm")
                    }

                    TextButton(
                        onClick = onDismissRequest
                    ) {
                        Text(text = "Cancel")
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DialogWithImagePreview() {
    DialogWithImage(onDismissRequest = { })
}