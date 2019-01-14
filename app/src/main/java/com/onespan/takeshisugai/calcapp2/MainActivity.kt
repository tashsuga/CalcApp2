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
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)

        /*
        intent.run {
            putExtra("VALUE1",  $textInputLayout)
            putExtra("VALUE2", $textInputLayout2)
        }
        */
         val s1 : String

        // textInputLayout.text.toString()
        // エディットテキストのテキストを取得
      // if(textInputLayout.toString() != null) {
        //    if(textInputLayout.getEditableText().toString() != null)
            // 取得したテキストを TextView に張り付ける
           // s1 =
           // val t1 : String = textInputLayout.toString()
            //val i1 = Long.(t1)
           // var textInputLayout_no1 = textInputLayout
           //s1 = "$textInputLayout1"
           s1 = TextInputLayout1.toString()

           Log.d("UI_PARTS", "入力 $s1")

           intent.putExtra("VALUE1", 3)
            intent.putExtra("VALUE2", 2)
       // }

        //startActivity(intent)
        startActivity(intent)
    }

}
