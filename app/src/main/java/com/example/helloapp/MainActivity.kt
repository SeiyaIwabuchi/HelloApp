package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //レイアウト読み込み
        setContentView(R.layout.activity_main);

        //オブジェクトの取得（省略）
        //オブジェクト
        var btnSend = findViewById<Button>(R.id.btnSend)
        var textInput = findViewById<TextView>(R.id.textInput)
        var textOutput = findViewById<TextView>(R.id.textOutput)

        //リスナ
        btnSend.setOnClickListener {
            //メソッド定義
            //fun {メソッド名} ({仮引数名} : {仮引数の型}) : {戻り値の型(void型の時はいらない)} { }
            Log.d("DEBUG","btnSendClicked")

            //テキスト取得
            var text = textInput.text.toString()

            //テキストの設定
            textOutput.setText(text)
        }
    }


}
