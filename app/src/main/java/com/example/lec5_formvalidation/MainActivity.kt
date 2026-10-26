package com.example.lec5_formvalidation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtUsername = findViewById<EditText>(R.id.edtUsername)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPhone = findViewById<EditText>(R.id.edtPhone)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener { view ->
            val username = edtUsername.text.toString().trim()
            val email = edtEmail.text.toString().trim()
            val phone = edtPhone.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            when {
                username.isEmpty() -> {
                    Snackbar.make(view, "Tên đăng nhập không được để trống!", Snackbar.LENGTH_LONG).show()
                }
                email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                    Snackbar.make(view, "Email không hợp lệ!", Snackbar.LENGTH_LONG).show()
                }
                phone.isEmpty() || phone.length < 10 -> {
                    Snackbar.make(view, "Số điện thoại phải từ 10 số trở lên!", Snackbar.LENGTH_LONG).show()
                }
                password.length < 6 -> {
                    Snackbar.make(view, "Mật khẩu phải có ít nhất 6 ký tự!", Snackbar.LENGTH_LONG).show()
                }
                else -> {
                    Snackbar.make(view, "Validate thành công!", Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }
}