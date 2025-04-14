package com.example.historicalflashcards

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.historicalflashcards.ui.theme.HistoricalFlashcardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HistoricalFlashcardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Unspecified
                ) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally)
                    {
                        Text(
                            text = "Welcome to Historical Flash Cards",
                            modifier = Modifier,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Black
                        )

                        Button(
                            onClick = {
                                //this takes you to the SlashCards screen
                                val next = Intent(this@MainActivity,Flashcards::class.java)
                                startActivity(next)

                            }) {
                            Text(text = "Mext")
                        }


                    }


                }
            }
        }
    }
}
