package com.example.learningapp.`5_Bottomsheet`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PartialBottomSheet() {

    var showBottomSheet by remember { mutableStateOf(false) }

    var sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )


    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {


        Button(
            onClick = { showBottomSheet = true }
        ) {

            Text("Show Bottom Sheet")

        }


        if(showBottomSheet)
        {
            ModalBottomSheet(
                modifier = Modifier.fillMaxHeight(),
                sheetState = sheetState,
                onDismissRequest = { showBottomSheet = false }


            ){
                Text("This is the bottom sheet content",)


            }
        }

    }



}


@Preview(showSystemUi = true)
@Composable
private fun Show2() {

    // lazyColumnExample()
    PartialBottomSheet()
}
