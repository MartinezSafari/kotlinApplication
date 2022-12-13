package org.thereachtrust.kotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton.setOnClickListener{
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
    }

    //Display a test when a button is clicked
    fun radioButtonClick(v: View){
        val radioButton = v as RadioButton
        Toast.makeText(this, "click ${radioButton.text}", Toast.LENGTH_LONG).show()

    }

}