package com.tads.idadecachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resposta.*

class RespostaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resposta)

        val dado: Bundle? = intent.extras

        val fin = dado?.getInt("idade")
          txt_resp.text = fin.toString()
    }
}
