package com.young.hellopublish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.young.hellolib.ICallback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val call = object : ICallback<String>{
          override fun onCall(bean: String) {
              Log.e("youngshen", "bean = $bean")
          }
      }

        call.onCall(getString(R.string.tiandi))

    }
}