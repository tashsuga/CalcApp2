package com.onespan.takeshisugai.calcapp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)


        if (v?.id == R.id.button) {
            // buttonがクリックされたとき

             if (editText1.text.toString().equals("") != true || editText2.text.toString().equals("")!= true) {
            // if (editText1.text.toString() != null || editText2.text.toString() != null) {
                // 取得したテキストを TextView に張り付ける
                // s1 =
                val t1: String = editText1.text.toString()
                val t2: String = editText2.text.toString()

                val t11: Double = t1.toDouble()
                val t22: Double = t2.toDouble()

                 val all: Double = t11 + t22


                intent.putExtra("VALUE_All", all)
                //val all: Double = value1 + value2

                // val all: Double = value1 + value2

                // intent.putExtra("VALUE3", t11)
                 // intent.putExtra("VALUE4", t22)

                startActivity(intent)
            }
        } else if (v?.id == R.id.button2) {
            if (editText1.text.toString().equals("") != true || editText2.text.toString().equals("")!= true) {
            //if (editText1.text.toString() != null || editText2.text.toString() != null) {
                // 取得したテキストを TextView に張り付ける
                // s1 =
                val t1: String = editText1.text.toString()
                val t2: String = editText2.text.toString()


                val t11: Double = t1.toDouble()
                val t22: Double = t2.toDouble()

                val all: Double = t22 - t11


                intent.putExtra("VALUE_All", all)



                startActivity(intent)
            }

        }
        else if (v?.id == R.id.button5) {
            if (editText1.text.toString().equals("") != true || editText2.text.toString().equals("")!= true) {
                // if (editText1.text.toString() != null || editText2.text.toString() != null) {
                // 取得したテキストを TextView に張り付ける
                // s1 =
                val t1: String = editText1.text.toString()
                val t2: String = editText2.text.toString()


                val t11: Double = t1.toDouble()
                val t22: Double = t2.toDouble()

                val all: Double = t22 * t11


                intent.putExtra("VALUE_All", all)



                startActivity(intent)
            }


        }
        else if (v?.id == R.id.button6) {
            if (editText1.text.toString().equals("") != true || editText2.text.toString().equals("")!= true) {
                // if (editText1.text.toString() != null || editText2.text.toString() != null) {
                // 取得したテキストを TextView に張り付ける
                // s1 =
                val t1: String = editText1.text.toString()
                val t2: String = editText2.text.toString()


                val t11: Double = t1.toDouble()
                val t22: Double = t2.toDouble()

                val all: Double = t22 / t11


                intent.putExtra("VALUE_All", all)



                startActivity(intent)
            }


        }
        /*
        else {
            this.setOnClickListener {
                v? ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Action") {
                        Log.d("UI_PARTS", "Snackbarをタップした")
                    }.show()
            }
        }

        */
    }
}
