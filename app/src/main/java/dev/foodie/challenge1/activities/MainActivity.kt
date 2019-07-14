package dev.foodie.challenge1.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.foodie.challenge1.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        aboutALCButton.setOnClickListener { startActivity(Intent(baseContext, AboutALCActivity::class.java)) }
        myProfileButton.setOnClickListener { startActivity(Intent(baseContext, MyProfileActivity::class.java)) }
    }
}
