package com.deyvsonaguiar.contathos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }

    private fun bindViews(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList() {
        adapter.UpdateList(
            arrayListOf(
                Contact(
                    "Deyvson Aguiar",
                    "(65) 99644-0301",
                    "img.jpg"
                ),
                Contact(
                    "Ruth Almeida",
                    "(65) 98464-3851",
                    "img.jpg"
                ),
            )
        )
    }

}