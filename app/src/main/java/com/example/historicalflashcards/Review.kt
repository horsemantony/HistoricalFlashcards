package com.example.historicalflashcards

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.historicalflashcards.ui.theme.HistoricalFlashcardsTheme

class Review : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val questions = arrayOf("Nelson Mandela was the first president of South Africa",
            "South Africa was the first country to voluntarily give up its nuclear weapons",
            "The earliest known people in South Africa were the San and Khoikhoi people, also known as the Khoisan",
            "South Africa adopted its current flag in 1949",
            "Apartheid was a system established to segregate black, coloured and indian people to give power to white people")

        val answers = arrayOf("False", "True","True","False","True")

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
                            text = "Historical Flashcards",
                            modifier = Modifier,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Black
                        )
                        Spacer(modifier = Modifier.size(30.dp))
                        Text(
                            text = "Score",
                            modifier = Modifier,
                            fontSize = 20.sp,
                        )
                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Question 1")
                        Text(text = questions[0])
                        Text(text = "   "+ answers[0])
                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Question 2")
                        Text(text = questions[1])
                        Text(text = "   "+ answers[1])
                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Question 3")
                        Text(text = questions[2])
                        Text(text = "   "+ answers[2])
                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Question 4")
                        Text(text = questions[3])
                        Text(text = "   "+ answers[3])
                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Question 5")
                        Text(text = questions[4])
                        Text(text = "   "+ answers[4])
                        Spacer(modifier = Modifier.size(30.dp))

                        Button(
                            onClick = {
                                //this takes you back to the MainActivity screen
                                val exit = Intent(this@Review,MainActivity::class.java)
                                startActivity(exit)

                            }) {
                            Text(text = "Back")
                        }
                    }
                }
            }
        }
    }
}

