package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_activity2.*
import kotlinx.android.synthetic.main.activity_activity3.*

class activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity3)

        btnselanjutnya.setOnClickListener(){
            val nama1 = nama.text.toString()
            val umur1 = umur.text.toString()
            if (nama1.isEmpty()){
                nama.setError("silahkan isi nama!")
            }
            else if (umur1.isEmpty()){
                umur.setError("silahkan isi umur!")
            }
            else {
                val intent = Intent(this, activity4::class.java)
                    .putExtra(EXTRA_MESSAGE, nama1)
                startActivity(intent)
            }
        }
    }
}
