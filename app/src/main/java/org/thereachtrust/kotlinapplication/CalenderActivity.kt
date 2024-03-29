package org.thereachtrust.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calender.*
import java.text.SimpleDateFormat
import java.util.*

class CalenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        calendarView.setOnDateChangeListener { calendarView, year, month, day ->
            val cal: Calendar = GregorianCalendar (year, month, day)
            val dateFormatter = SimpleDateFormat ("yyyy/MM/dd")
            Toast.makeText(this, dateFormatter.format(cal.time), Toast.LENGTH_LONG).show()
        }

        doneButton.setOnClickListener{
            finish()
        }
    }
}