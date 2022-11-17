package com.example.cards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var title : TextView
    lateinit var rules : TextView
    lateinit var ranks : TextView
    lateinit var suits : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = findViewById(R.id.title)
        rules = findViewById(R.id.rules)
        ranks = findViewById(R.id.ranks)
        suits = findViewById(R.id.suits)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // skapa ett intent-objekt, i detta objekt skickar vi in vilken klass
            // vår nya aktivitet är av
            val intent = Intent(this, Game::class.java)



            // starta den nya aktivteten med hjälp av intetntet
            startActivity(intent)
        }




    }
}