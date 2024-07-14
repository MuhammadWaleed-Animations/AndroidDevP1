package com.ffandroidproj1.userprofilescreen

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var ubtn : Button
    private lateinit var eUname:EditText
    private lateinit var eEmail:EditText
    private lateinit var uname: TextView
    private lateinit var email: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUI()
        setEventHandlers()
    }
    private fun initUI()
    {
        ubtn = findViewById<Button>(R.id.btn)
        eUname = findViewById<EditText>(R.id.eUsername)
        eEmail = findViewById<EditText>(R.id.eEmail)
        uname = findViewById(R.id.username)
        email = findViewById(R.id.email)
    }
    private fun setEventHandlers()
    {
        ubtn.setOnClickListener {
            if(eUname.text != null && eEmail.text != null)
            {
                uname.text = "User Name:\n" + eUname.text
                email.text = "Email:\n" + eEmail.text
            }
        }
    }

}