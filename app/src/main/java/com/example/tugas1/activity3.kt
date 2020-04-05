package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_activity2.*
import kotlinx.android.synthetic.main.activity_activity3.*

class activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity3)

        btnselanjutnya.setOnClickListener(){
            val intent = Intent(this, activity4::class.java)
            startActivity(intent)
        }

    }
}
