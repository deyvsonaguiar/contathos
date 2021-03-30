package com.deyvsonaguiar.contathos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        return toast.show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.item_menu_1) {
            showToast("Exibindo Menu 1")
            return true
        }
        if (item.itemId == R.id.item_menu_2) {
            showToast("Exibindo Menu 2")
            return true
        }
        else return super.onOptionsItemSelected(item)

    /*
        return when(item.itemId) {
            R.id.item_menu_1 -> {
                showToast("Exibindo Menu 1")
                true
            }
            R.id.item_menu_2 -> {
                showToast("Exibindo Menu 2")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

         */

    }

}