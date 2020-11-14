package com.appisna.blogspot.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : BaseActivity() {
    //코드만 작성 해서는 실행되지 않음.
    //메모리에 올라가야 실행됨.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        setupEvents()
        setValues()

        Log.d("다른 화면", "onCreate 실행")
    }
    override fun setupEvents() {

    }

    override fun setValues() {
    }


}