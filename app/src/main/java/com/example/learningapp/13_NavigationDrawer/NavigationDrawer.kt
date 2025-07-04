package com.example.learningapp.`13_NavigationDrawer`

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningapp.`12_Scaffold`.ScaffoldExample
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailDrawerMenu() {

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed

    )


    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {


                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 16.dp)
                ) {


                    Text("Drawer Title :")

                    HorizontalDivider()

                    Text("Content of Drawer ")


                }

                NavigationDrawerItem(

                    label = {
                        Text("item 1")
                    },
                    selected = false,
                    onClick = {

                    }
                )


                NavigationDrawerItem(

                    label = {
                        Text("item 2")
                    },
                    selected = false,
                    onClick = {

                    }
                )


                NavigationDrawerItem(

                    label = {
                        Text("item 3")
                    },
                    selected = false,
                    onClick = {

                    }
                )


                NavigationDrawerItem(

                    label = {
                        Text("item 4")
                    },
                    selected = false,
                    onClick = {

                    }
                )

            }
        },
        drawerState = drawerState,

        ) {

        Scaffold(topBar = {
            TopAppBar(
                title = { Text("Naviagation Drawer") },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            scope.launch {

                                if (drawerState.isClosed) {

                                    drawerState.open()
                                }
                            }
                        }

                    ) {
                        androidx.compose.material3.Icon(
                            Icons.Default.Menu,
                            contentDescription = "Menu"
                        )


                    }
                }


            )


        }) { innerPadding ->

            Column(modifier = Modifier.padding(innerPadding)) { }

        }


    }


}

@Preview(showBackground = true)
@Composable
fun DialogWithImagePreview() {
    DetailDrawerMenu()
}


