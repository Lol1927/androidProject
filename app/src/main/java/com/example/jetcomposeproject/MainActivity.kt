package com.example.jetcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetcomposeproject.ui.theme.JetComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            ColorBoxScreen()
        }
    }
}

@Composable
fun ColorBoxScreen() {
    Column(
        modifier = Modifier
            .background(Color(0xFF8000D7))
            .fillMaxSize()
            .padding(10.dp)
            .border(10.dp, Color.Blue)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(5.dp)
            .background(Color.Green)
            .padding(10.dp)
    ) {
        Text("Hello", color = Color.Black)
        Spacer(modifier = Modifier.height(50.dp))
        Text("World", color = Color.Black)
    }
}
