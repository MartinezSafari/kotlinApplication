package org.thereachtrust.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calender.*
import kotlinx.android.synthetic.main.activity_number.*

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)



        mynumberPicker.minValue= 3
        mynumberPicker.maxValue=20

        mynumberPicker.wrapSelectorWheel= false

        mynumberPicker.setOnValueChangedListener { picker, oldValue, newValue ->

            Toast.makeText(this, "value is: $newValue",Toast.LENGTH_LONG).show()
        }

        doneButton2.setOnClickListener{
            finish()
        }
    }
}