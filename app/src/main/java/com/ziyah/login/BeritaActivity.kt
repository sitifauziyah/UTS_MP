package com.ziyah.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_berita.*
import kotlinx.android.synthetic.main.activity_dashboard.*

class BeritaActivity : AppCompatActivity() {
    val list = ArrayList<Users>()

    val listUsers = arrayOf(
        "Artificial Intelligent",
        "Virtual Reality",
        "SmartHome"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        Btnkembali.setOnClickListener({
            startActivity(Intent(this, DashboardActivity::class.java))
        })
        for (i in 0 until listUsers.size) {

            list.add(Users(listUsers.get(i)))

            if (listUsers.size - 1 == i) {
                // init adapter yang telah dibuat tadi
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()

                //tampilkan data dalam recycler view
                mRecyclerView.adapter = adapter
            }
        }
    }
}