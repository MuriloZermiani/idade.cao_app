package com.tads.idadecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener {

            val intent = Intent(applicationContext, RespostaActivity::class.java)


            //passar dados

            var ida = text_idade.text.toString().toInt()

            var m = 7

            var res = ida*m


          // lblRes.text = res.toString()

            intent.putExtra("idade", res)

         startActivity(intent)
        }
    }
}



