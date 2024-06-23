package com.example.introapp

import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity

import com.example.introapp.database.Item
import com.example.introapp.database.ItemDao
import com.example.introapp.database.ItemRoomDatabase

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    lateinit var dao: ItemDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        var  database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()

    }

    override fun onStart() {
        super.onStart()
    }

    fun insertDb(view: View) {
        GlobalScope.launch {
            val item = Item(777,"fruits",111.0,22)
            dao.insert(item)

        }
    }
}