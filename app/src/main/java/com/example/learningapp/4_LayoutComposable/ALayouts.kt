package com.example.learningapp.`4_LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.learningapp.R


//1.Column,it is used to arrange the children in a vertical manner
//2. Row,it is used to arrange the children in a horizontal manner
//3. Box,it is used to arrange the children in a stack manner


@Composable
fun ColumnExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)
            .padding(
                15.dp
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("item 1")
        Text("item 2")
        Text("item 3")
        Text("item 4")
        Text("item 5")

    }

}


@Composable
fun RowExample() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)
            .padding(
                15.dp
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Text("item 1")
        Text("item 2")
        Text("item 3")
        Text("item 4")
        Text("item 5")

    }

}


@Composable
fun BoxExample() {

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(color = Color.Green),
        contentAlignment = Alignment.Center
    )
    {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(color = Color.DarkGray),
            contentAlignment = Alignment.Center
        ) {


        }

    }

}


//4.ConstraintLayout,it is used to arrange the children in a flexible manner

@Composable
fun ConstraintLayoutExample() {

    Column {

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = colorResource(R.color.gray))
        )
        {

            val (text1, text2, text3) = createRefs()


            Text(
                "Bottom Left ", modifier = Modifier
                    .constrainAs(text1) {
                        bottom.linkTo(parent.bottom, margin = 8.dp)
                        start.linkTo(parent.start, margin = 8.dp)
                    }
                    .padding(8.dp)
            )

            Text(
                "Center Left ", modifier = Modifier
                    .constrainAs(text2) {
                        top.linkTo(parent.top, margin = 8.dp)
                        bottom.linkTo(parent.bottom, margin = 8.dp)
                        end.linkTo(parent.end, margin = 8.dp)
                        start.linkTo(parent.start, margin = 8.dp)
                    }
                    .padding(8.dp)
            )


            Text(
                "Top Right ", modifier = Modifier
                    .constrainAs(text3) {
                        top.linkTo(parent.top, margin = 8.dp)
                        end.linkTo(parent.end, margin = 8.dp)

                    }
                    .padding(8.dp)
            )



        }


    }


}


@Preview(showSystemUi = true)
@Composable
private fun ShowButton() {


    //  ColumnExample()
    //  RowExample()
    //  BoxExample()
    ConstraintLayoutExample()
}