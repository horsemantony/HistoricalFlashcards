package com.example.historicalflashcards

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.historicalflashcards.ui.theme.HistoricalFlashcardsTheme

class Flashcards : ComponentActivity() {
    @SuppressLint("InvalidColorHexValue")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HistoricalFlashcardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Transparent)
                {

                    val questions = arrayOf("Nelson Mandela was the first president of South Africa",
                        "South Africa was the first country to voluntarily give up its nuclear weapons",
                        "The earliest known people in South Africa were the San and Khoikhoi people, also known as the Khoisan",
                        "South Africa adopted its flag in 1949",
                        "Apartheid was a system established to segregate black, coloured and indian people to give power to white people")
                    val answers = arrayOf("False", "True","True","False","True")
                    var score = 0

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        Text(
                            text = "Historical Flashcards",
                            modifier = Modifier,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Black
                        )

                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = questions[0])

                        Row {
                            Button(
                                onClick = {
                                }) {
                                Text(text = "True")
                            }

                            Button(
                                onClick = {

                                },
                                /*modifier = Modifier,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xfffb0)
                                 */
                            ) {
                                Text(text = "False")
                            }
                        }

                        Spacer(modifier = Modifier.size(30.dp))

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
                                    for (list in questions)
                                        print(list)


                                }) {
                                Text(text = "Next")
                            }
                        }

                        Text(text = "Score: $score/5")


                    }

                }
            }
        }
    }
}
