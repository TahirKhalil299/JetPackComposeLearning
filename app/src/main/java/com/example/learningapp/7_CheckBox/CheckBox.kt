package com.example.learningapp.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxExample() {
    var childChecked by remember { mutableStateOf(listOf(false, false, false)) }

    val parentState = when {
        childChecked.all { it } -> ToggleableState.On
        childChecked.none { it } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Select all")

            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    childChecked = childChecked.map { newState }
                }
            )
        }

        childChecked.forEachIndexed { index, isChecked ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Option ${index + 1}")

                Checkbox(
                    checked = isChecked,
                    onCheckedChange = { newValue ->
                        childChecked = childChecked.mapIndexed { i, current ->
                            if (i == index) newValue else current
                        }
                    }
                )
            }
        }

        if (childChecked.all { it }) {
            Text("All options selected")
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun Show() {


    CheckBoxExample()
}
