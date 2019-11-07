package com.example.mybatik

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.detail_mybatik.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_mybatik)

        showProductDetail()
    }

    private fun showProductDetail() {

        var tvDataReceived_t: TextView = findViewById(R.id.detail_title)
        var tvDataReceived_d: TextView= findViewById(R.id.detail_description)
        var tvDataReceived_g: ImageView= findViewById(R.id.detail_gambar)

        tvDataReceived_t.setText(intent.getStringExtra(EXTRA_TITLE))
        tvDataReceived_d.setText(intent.getStringExtra(EXTRA_DESCRIPTION))

        Glide.with(this).load(intent.getStringExtra(EXTRA_PHOTO)).into(tvDataReceived_g)


    }
}