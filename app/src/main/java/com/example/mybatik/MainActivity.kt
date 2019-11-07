package com.example.mybatik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvmybatik: RecyclerView
    private var list: ArrayList<mybatik> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvmybatik = findViewById(R.id.rv_mybatik)
        rvmybatik.setHasFixedSize(true)

        list.addAll(mybatik_data.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvmybatik.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = mybatik_adapter(list)
        rvmybatik.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : mybatik_adapter.OnItemClickCallback {
            override fun onItemClicked(data: mybatik) {
                showSelectedHero(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_list -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
                }
            }
    }

    private fun showSelectedHero(mybatik: mybatik) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_TITLE, mybatik.title)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DESCRIPTION, mybatik.description)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, mybatik.photo)
        startActivity(moveWithDataIntent)
    }

}
