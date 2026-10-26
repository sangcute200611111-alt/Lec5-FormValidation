package com.example.lec5_formvalidation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvUser = findViewById<TextView>(R.id.tvWelcomeUser)
        val tvEmail = findViewById<TextView>(R.id.tvWelcomeEmail)
        val tvPhone = findViewById<TextView>(R.id.tvWelcomePhone)

        val user = intent.getSerializableExtra("EXTRA_USER") as? User
        user?.let {
            tvUser.text = "Tên đăng nhập: ${it.username}"
            tvEmail.text = "Email: ${it.email}"
            tvPhone.text = "Số điện thoại: ${it.phone}"
        }
    }
}