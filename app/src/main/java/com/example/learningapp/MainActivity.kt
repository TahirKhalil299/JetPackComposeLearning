package com.example.learningapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.learningapp.`13_NavigationDrawer`.DetailDrawerMenu
import com.example.learningapp.`2_FundanmentalConcept`.AccessStringResource
import com.example.learningapp.`2_FundanmentalConcept`.Greeting
import com.example.learningapp.`3_CoreComponents`.AnnotatedStringWithListenerSample
import com.example.learningapp.`3_CoreComponents`.FilledButtonSample
import com.example.learningapp.`3_CoreComponents`.PasswordTextFieldSample
import com.example.learningapp.`7_CheckBox`.CheckBoxExample
import com.example.learningapp.ui.theme.LearningAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningAppTheme {
                DetailDrawerMenu()
            }
        }
    }
}
