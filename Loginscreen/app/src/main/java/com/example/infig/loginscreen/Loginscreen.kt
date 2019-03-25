package com.example.infig.loginscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.MainThread
import android.support.v7.app.AlertDialog
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_loginscreen.*
import android.content.Intent


class Loginscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginscreen)

        login_button.setOnClickListener{
            val mail = mail.text.toString()
            val password = password.text.toString()
            if (isEmailValid(mail)){
                    val intent = getIntent()
                    intent.putExtra("email", mail)
                    intent.putExtra("password", password)
                    startActivity(intent)

                }

            }

        }
    }

    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }






