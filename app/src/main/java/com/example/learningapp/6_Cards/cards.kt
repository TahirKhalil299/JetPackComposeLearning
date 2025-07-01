package com.example.learningapp.`6_Cards`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningapp.`5_Bottomsheet`.PartialBottomSheet


@Composable
fun ElevatedCard() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {


        ElevatedCard(
            elevation = CardDefaults.cardElevation(10.dp),
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
        ) {

            Text(
                "This is an Elevated Card",
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center

            )
        }


    }


}


@Preview(showSystemUi = true)
@Composable
private fun Show2() {

    // lazyColumnExample()
    ElevatedCard()
}
