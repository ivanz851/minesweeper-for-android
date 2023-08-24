package com.ivanz851.minesweeper

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ivanz851.minesweeper.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.main_btn_start -> {
                finish()
                val intent = Intent(this, GameActivity::class.java)
                startActivity(intent)
            }
            R.id.main_btn_about -> {
                finish()
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
            R.id.main_btn_exit -> finish()
        }
    }
}