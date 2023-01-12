package org.thereachtrust.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_number.*
import kotlinx.android.synthetic.main.activity_seek_bar.*

class SeekBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        mySeekBar.progress= 10
        mySeekBar.max= 100

        mySeekBar.setOnSeekBarChangeListener(
            object: SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(seekBar: SeekBar?, currentProgress: Int,
                                               userInitiated: Boolean)
                {
                    Toast.makeText(this@SeekBarActivity, "val is: $currentProgress",Toast.LENGTH_LONG).show()

                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                    //TODO("Not yet implemented")
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                    //TODO("Not yet implemented")
                }
            }
        )

        doneButton3.setOnClickListener{
            finish()
        }
    }
}