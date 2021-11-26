package com.nepplus.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRandomNumArr = ArrayList<Int>()

    lateinit var mRandomNumList: ArrayList<TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setVlues()
    }


    fun setupEvents(){

        btnRandomNum.setOnClickListener {

            makeRandomNum()

        }


    }

    fun makeRandomNum() {

        mRandomNumArr.clear()

        for (i in 0 until 6){

            while (true){

                val randomNum = (Math.random() * 45 + 1).toInt()

                val isDupleOk = !mRandomNumArr.contains(randomNum)

                if (isDupleOk){

                    mRandomNumArr.add(randomNum)

                    break

                }

            }


        }

        mRandomNumArr.sort()
        for (i in 0 until 6){

            mRandomNumList[i].text = mRandomNumArr[i].toString()
        }



    }

    fun setVlues() {


        arrayListOf(txtRandomNum1,txtRandomNum2,txtRandomNum3,txtRandomNum4,txtRandomNum5,txtRandomNum6)

    }



}