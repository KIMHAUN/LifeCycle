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
        //onCreate() -> onResume()순서
        //처음 만들어질 때, 뒤로가기, 홈버튼갔다가 돌아오는 상황도 포함
        super.onResume()
        Log.d("메인 화면", "onResume 실행")
    }

    //액티비티가 화면에서 사라지려고 할 때 실행되는 함수. onResume()의 반대 개념.
    //finish()로 종료 + 다른화면에 의해 가려짐, 홈 등으로 빠져나갈 때
    override fun onPause() {
        super.onPause()

        Log.d("메인 화면", "onPause 실행")

    }

    //쓸일이 거의 없음.
    //액티비티가 메모리에서 소멸될 때 실행.(onCreate()의 반대 개념)
    //finish()등으로 액티비티가 완전히 종료되면서 실행됨.
    //언젠가 GC가 메모리를 수거해가는 과정에서 실행되는 함수.
    override fun onDestroy() {
        super.onDestroy()
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