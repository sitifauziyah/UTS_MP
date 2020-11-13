package com.ziyah.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.satria.login.helper.Constant
import com.satria.login.helper.PreferencesHelper
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_user.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        imgberita.setOnClickListener({
            startActivity(Intent(this, BeritaActivity::class.java))
            showMessage("Ini adalah Halaman Berita")
        })
        imgProfile.setOnClickListener({
            startActivity(Intent(this, ProfileActivity::class.java))
            showMessage("Ini adalah Halaman Profile")
        })
        imgExit.setOnClickListener({
            System.exit(0)
            finish()
        })

        ImgKalkulator.setOnClickListener({
            startActivity(Intent(this, KalkulatorActivity::class.java))
            showMessage("Ini adalah Halaman Kalkulator")
        })
    }
    private fun showMessage(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}