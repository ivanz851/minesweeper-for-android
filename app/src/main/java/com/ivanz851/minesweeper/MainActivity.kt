package com.ivanz851.minesweeper

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.common.AccountPicker


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val G_PLUS_SCOPE = "oauth2:https://www.googleapis.com/auth/plus.me"
    private val USERINFO_SCOPE = "https://www.googleapis.com/auth/userinfo.profile"
    private val EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email"
    private val SCOPES = "$G_PLUS_SCOPE $USERINFO_SCOPE $EMAIL_SCOPE"

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