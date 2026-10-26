package com.example.lec5_formvalidation

import java.io.Serializable

data class User(
    val username: String,
    val email: String,
    val phone: String,
    val password: String
) : Serializable