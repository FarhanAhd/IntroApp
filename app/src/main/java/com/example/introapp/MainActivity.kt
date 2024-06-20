package com.example.introapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"

    //chick is getting created in the egg  --- memory is being allocated for the activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"activity created")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    //chick has hatched  --- activity is visible for clicks
    override fun onStart() {
        super.onStart()
        Log.i(TAG,"activity started")

    }

    //chick has woken up -- come back to the foreground
    override fun onResume() {
        super.onResume()
        Log.i(TAG,"activity resumed")

    }

    //chick has slept  --is partially visible -- background
    override fun onPause() {
        super.onPause()
        Log.i(TAG,"activity paused")

    }

    //activity hibernated
    override fun onStop() {
        super.onStop()
        Log.i(TAG,"activity stopped")

    }

    //all the resources are purged
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"activity destroyed")

    }

    fun myClickHandler(view: View) {
        Log.i("MainActivity","button clicked")
        var webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(webIntent)
    }

}