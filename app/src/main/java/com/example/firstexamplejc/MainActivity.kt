package com.example.firstexamplejc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstexamplejc.ui.theme.FirstExampleJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstExampleJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    MyNameText(name = "")
                    //TestMyNameText()
                }
            }
        }
    }
}

@Preview(
    name = "EXAMPLE 1",
    showBackground = true,
    showSystemUi = true,
    apiLevel = 29,
    device = Devices.NEXUS_5
)
@Composable
fun TestMyNameText() {
    MyNameText("| Test")
}


@Composable
fun MyNameText(name: String) {
    Text(text = "Martin Pro Developer $name", modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 20.dp)
        .clickable {  })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstExampleJCTheme {
        Greeting("Android")
    }
}