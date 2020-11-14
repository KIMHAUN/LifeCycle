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

    //이어가다
    override fun onResume() {
        //onCreate -> onResume순서
        //처음 만들어질 때, 뒤로가기, 홈버튼갔다가 돌아오는 상황도 포함
        super.onResume()
        Log.d("메인 화면", "onResume 실행")
    }

    //액티비티가 화면에서 사라지려고 할 때 실행되는 함수. onResume의 반대 개념.
    //finish로 종료 + 다른화면에 의해 가려짐, 홈 등으로 빠져나갈 때
    override fun onPause() {
        super.onPause()

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