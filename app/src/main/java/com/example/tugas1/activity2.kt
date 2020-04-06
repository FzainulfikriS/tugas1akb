package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activity2.*
import kotlinx.android.synthetic.main.activity_main.*

class activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)

        btnmasuk.setOnClickListener(){
            val form1 = form.text.toString()

            if (form1.isEmpty()){
                form.setError("silahkan isi kode keluarga!")
            }
            else {
                val intent = Intent(this, activity3::class.java)
                startActivity(intent)
            }
        }
    }
}
