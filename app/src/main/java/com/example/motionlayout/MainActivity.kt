package com.androidstuff.motionlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val but1 = findViewById<Button>(R.id.button1)
        val but2 = findViewById<Button>(R.id.button2)
        val but3 = findViewById<Button>(R.id.button3)
        val but4 = findViewById<Button>(R.id.button4)
        val but5 = findViewById<Button>(R.id.button5)
        val but6 = findViewById<Button>(R.id.button6)

        but1.setOnClickListener{
            val intent= Intent(this, Main1Activity::class.java)
            startActivity(intent)
        }
        but2.setOnClickListener{
            val intent= Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
        but3.setOnClickListener{
            val intent= Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }
        but4.setOnClickListener{
            val intent= Intent(this, Main4Activity::class.java)
            startActivity(intent)
        }
        but5.setOnClickListener{
            val intent= Intent(this, Main5Activity::class.java)
            startActivity(intent)
        }
        but6.setOnClickListener{
            val intent= Intent(this, FlutterLikeAnimationActivity::class.java)
            startActivity(intent)
        }
    }
}