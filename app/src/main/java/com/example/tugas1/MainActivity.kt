package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_awal.setOnClickListener(){
            val intent = Intent(this, activity2::class.java)
            startActivity(intent)
        }

    }
}

/* nama  : Faiz Zainulfikri S
*  nim   : 10117165
*  kelas : IF5
* */
//3 april > membuat project dan tampilan halaman 1 dan 2
//4 april > beres membuat halaman 1 dan 2
//5 april > membereskan halaman 3 dan 4, mengambil data dari halaman 3 dan melakukan validasi
//6 april > mengecek kembali tugas, dan memberi validasi pada halaman 2