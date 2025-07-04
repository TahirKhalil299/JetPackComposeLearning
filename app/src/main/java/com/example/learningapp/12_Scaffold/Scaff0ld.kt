package com.example.learningapp.`12_Scaffold`

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningapp.`11_Menu`.DropDownMenuExample


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {


    var presses by remember { mutableStateOf(0) }


    Scaffold(

        topBar = {
            TopAppBar(
                colors = TopAppBarColors(

                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.primaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.scrim
                ),
                title = { Text("Top App Bar") }


            )

        },
        bottomBar = {

            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {

                Text(

                    text = "Bottom APP Bar",
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center

                )


            }


        },
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Text("I have been CLicked $presses times")

            }
        }


    ) { innerPadding ->


        Column(modifier = Modifier.padding(innerPadding)) {

            Text("This is the text")
        }
    }

}



@Preview(showBackground = true)
@Composable
fun DialogWithImagePreview() {
    ScaffoldExample()
}
