package com.travel.money.travelmoney

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TravelMoneyActivity : AppCompatActivity() {
    lateinit var travelerCountEditText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_money)
        initView()

    }

    fun initView(){
        travelerCountEditText = findViewById(R.id.traveler_count) as EditText
        val startButton : Button = findViewById(R.id.start) as Button
        val showTextView : TextView= findViewById(R.id.show) as TextView
        startButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                showTextView.setText(travelerCountEditText.text)
                closeKeypad()
            }
        })
    }

    fun closeKeypad(){
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE)  as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(travelerCountEditText.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

}
