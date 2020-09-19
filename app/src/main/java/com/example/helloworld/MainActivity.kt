package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.mainactivity_layout.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity_layout)
        Log.d ( "TAG_NAME" ,  "MESSAGE_YOU_WANT_TO_PRINT" )

        send_btn.setOnClickListener{
            sendMessage()
        }
    }
    /** Called when the user taps the Send button */
    fun sendMessage() {
        val editText = findViewById<EditText>(R.id.message_edit)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}

/// Upload the new files.... with all the changes that I made now.... the same way i did before?AMAN? YES!!!!! UPLOAD ALL OF THEM ok