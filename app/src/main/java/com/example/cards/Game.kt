package com.example.cards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val higherButton = findViewById<ImageButton>(R.id.higherButton)
        val lowerButton = findViewById<ImageButton>(R.id.lowerButton)
        val cardImageView = findViewById<ImageView>(R.id.cardImageView)
        var lastCard = 0
        var score = 0
        val currentScore = findViewById<TextView>(R.id.currentScore)

        currentScore.text = score.toString()

        higherButton.setOnClickListener {

            val newCard = drawCard(cardImageView)
            if(newCard > lastCard) {
                score++
            } else {
                score = 0
            }
            lastCard = newCard
            currentScore.text = score.toString()

            if(score == 10) {
                currentScore.text = "YOU WON!!!"
            }
        }

        lowerButton.setOnClickListener {

            val newCard = drawCard(cardImageView)
            if(newCard < lastCard) {
                score++
            } else {
                score = 0
            }
            lastCard = newCard
            currentScore.text = score.toString()
        }

        if(score == 10) {
            currentScore.text = "YOU WON!!!"
        }
    }

    private fun drawCard(cardImageView : ImageView) : Int{
        val randomNumber = (1..52).random()
        when(randomNumber) {
            1 -> cardImageView.setImageResource(R.drawable.clubs2)
            2 -> cardImageView.setImageResource(R.drawable.diamonds2)
            3 -> cardImageView.setImageResource(R.drawable.hearts2)
            4 -> cardImageView.setImageResource(R.drawable.spades2)
            5 -> cardImageView.setImageResource(R.drawable.clubs3)
            6 -> cardImageView.setImageResource(R.drawable.diamonds3)
            7 -> cardImageView.setImageResource(R.drawable.hearts3)
            8 -> cardImageView.setImageResource(R.drawable.spades3)
            9 -> cardImageView.setImageResource(R.drawable.clubs4)
            10 -> cardImageView.setImageResource(R.drawable.diamonds4)
            11 -> cardImageView.setImageResource(R.drawable.hearts4)
            12 -> cardImageView.setImageResource(R.drawable.spades4)
            13 -> cardImageView.setImageResource(R.drawable.clubs5)
            14 -> cardImageView.setImageResource(R.drawable.diamonds5)
            15 -> cardImageView.setImageResource(R.drawable.hearts5)
            16-> cardImageView.setImageResource(R.drawable.spades5)
            17-> cardImageView.setImageResource(R.drawable.clubs6)
            18-> cardImageView.setImageResource(R.drawable.diamonds6)
            19-> cardImageView.setImageResource(R.drawable.hearts6)
            20 -> cardImageView.setImageResource(R.drawable.spades6)
            21 -> cardImageView.setImageResource(R.drawable.clubs7)
            22 -> cardImageView.setImageResource(R.drawable.diamonds7)
            23-> cardImageView.setImageResource(R.drawable.hearts7)
            24-> cardImageView.setImageResource(R.drawable.spades7)
            25-> cardImageView.setImageResource(R.drawable.clubs8)
            26 -> cardImageView.setImageResource(R.drawable.diamonds8)
            27 -> cardImageView.setImageResource(R.drawable.hearts8)
            28 -> cardImageView.setImageResource(R.drawable.spades8)
            29-> cardImageView.setImageResource(R.drawable.clubs9)
            30-> cardImageView.setImageResource(R.drawable.diamonds9)
            31-> cardImageView.setImageResource(R.drawable.hearts9)
            32-> cardImageView.setImageResource(R.drawable.spades9)
            33-> cardImageView.setImageResource(R.drawable.clubs10)
            34 -> cardImageView.setImageResource(R.drawable.diamonds10)
            35 -> cardImageView.setImageResource(R.drawable.hearts10)
            36 -> cardImageView.setImageResource(R.drawable.spades10)
            37-> cardImageView.setImageResource(R.drawable.jackclubs)
            38-> cardImageView.setImageResource(R.drawable.diamondsjack)
            39-> cardImageView.setImageResource(R.drawable.heartsjack)
            40 -> cardImageView.setImageResource(R.drawable.jackspades)
            41 -> cardImageView.setImageResource(R.drawable.queenclubs)
            42 -> cardImageView.setImageResource(R.drawable.diamondsqueen)
            43-> cardImageView.setImageResource(R.drawable.heartsqueen)
            44-> cardImageView.setImageResource(R.drawable.queenspades)
            45-> cardImageView.setImageResource(R.drawable.kingclubs)
            46-> cardImageView.setImageResource(R.drawable.diamondsking)
            47-> cardImageView.setImageResource(R.drawable.heartsking)
            48-> cardImageView.setImageResource(R.drawable.kingspades)
            49 -> cardImageView.setImageResource(R.drawable.aceclubs)
            50 -> cardImageView.setImageResource(R.drawable.acediamonds)
            51 -> cardImageView.setImageResource(R.drawable.acehearts)
            52-> cardImageView.setImageResource(R.drawable.acespades)

        }
        return randomNumber
    }
}