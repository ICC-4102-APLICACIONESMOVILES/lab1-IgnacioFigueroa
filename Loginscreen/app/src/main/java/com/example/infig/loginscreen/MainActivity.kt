package com.example.infig.loginscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginscreen.view.*
import kotlinx.android.synthetic.main.activity_main.*
import android.provider.ContactsContract.CommonDataKinds.Phone



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mail= mail.text.toString()
        val password = password.text.toString()
        if (mail.isBlank() and password.isBlank()){
            val task_request = 1
            val intent = Intent(this, Loginscreen::class.java)
            startActivityForResult(intent,task_request )
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {


    }

}
