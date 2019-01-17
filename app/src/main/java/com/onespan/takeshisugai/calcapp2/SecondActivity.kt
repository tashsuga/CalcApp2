package com.onespan.takeshisugai.calcapp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_second.*
import java.text.DecimalFormat

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /*
    val DecimalFormat t1 = 0.0
*/

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)


       val all: Double = value1 + value2

        textView.text = all.toString()


        //t2: Double
        //textView.text = "${value1 + value2}"


    }
}

// private fun Parcelable.getIntExtra(s: String, editText1: EditText?): Int {
// }
