package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_activity4.*

class activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity4)

        val nama1 = intent.getStringExtra(EXTRA_MESSAGE)
        tvakhir.setText(
            "Beres! Sekarang "+nama1 +" udah bisa ngecek penggunaan HP mu tiap hari buat " +
                    "bantu kamu ngatur waktu :)"
        )
    }
}
