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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.historicalflashcards.ui.theme.HistoricalFlashcardsTheme

class ScoreScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var score =intent.getIntExtra("score", -1)

        super.onCreate(savedInstanceState)
        setContent {
            var feedback by remember {
                mutableStateOf("")
            }
            HistoricalFlashcardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFB069)
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

                        Text(
                            text = "Your score is  $score /5",
                            modifier = Modifier,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black
                        )

                        Spacer(modifier = Modifier.size(30.dp))

                        if (score >=6){
                            feedback = "Invalid Score"
                        }
                        if (score == 0){
                            feedback = "You did not try at all"
                        }
                        if (score == 1){
                            feedback = "Poor Effort"
                        }
                        if (score == 2){
                            feedback = "Try Harder"
                        }
                        if (score == 3){
                            feedback = "Not Good Enough"
                        }
                        if (score == 4){
                            feedback = "Well Done"
                        }
                        if (score == 5){
                            feedback = "Perfect!"
                        }

                        Text(text = feedback)

                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Press the button below to review the correct answers")

                        Spacer(modifier = Modifier.size(30.dp))

                        Button(
                            onClick = {
                                val next = Intent(this@ScoreScreen,Review::class.java)
                                next.putExtra("score", score)
                                startActivity(next)
                            })
                        {
                            Text(text = "Review Cards")
                        }
                    }
                }
            }
        }
    }
}
