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

        //button2.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)


        if (v?.id == R.id.button) {
            // buttonがクリックされたとき

            // if (editText1.text.toString().equals("") || editText1.text.toString().equals(""))
            if (editText1.text.toString() != null || editText2.text.toString() != null) {
                // 取得したテキストを TextView に張り付ける
                // s1 =
                val t1: String = editText1.text.toString()
                val t2: String = editText2.text.toString()

                val t11: Double = t1.toDouble()
                val t22: Double = t2.toDouble()


                intent.putExtra("VALUE1", t11)
                intent.putExtra("VALUE2", t22)



                startActivity(intent)
            }
        } else if (v?.id == R.id.button2) {
            // if (editText1.text.toString().equals("") || editText1.text.toString().equals(""))
            if (editText1.text.toString() != null || editText2.text.toString() != null) {
                // 取得したテキストを TextView に張り付ける
                // s1 =
                val t1: String = editText1.text.toString()
                val t2: String = editText2.text.toString()

                val t11: Double = t1.toDouble()
                val t22: Double = t2.toDouble()


                intent.putExtra("VALUE1", t11)
                intent.putExtra("VALUE2", t22)



                startActivity(intent)
            }


        }
    }
}
