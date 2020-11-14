package com.appisna.blogspot.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("메인화면", "onCreate 실행")

    }
    override fun setupEvents() {

        moveBtn.setOnClickListener {
            //intent를 통해 실행될 때마다 onCreate가 항상 다시 실행됨.
            var myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {
    }
}