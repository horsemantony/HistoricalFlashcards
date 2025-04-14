package com.example.historicalflashcards

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.historicalflashcards.ui.theme.HistoricalFlashcardsTheme

class Flashcards : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HistoricalFlashcardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Transparent
                ) {
                   
                    Column {

                        Row {
                            Button(
                                onClick = {

                                    //this takes you back to the MainActivity screen
                                    val back = Intent(this@Flashcards,MainActivity::class.java)
                                    startActivity(back)

                                }) {
                                Text(text = "Back")
                            }

                            Button(
                                onClick = {


                                }) {
                                Text(text = "Next")
                            }
                        }


                    }
                    
                }
            }
        }
    }
}
