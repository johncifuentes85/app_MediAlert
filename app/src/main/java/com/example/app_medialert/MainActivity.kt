package com.example.app_medialert

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var etId: EditText
    private lateinit var etPass: EditText
    private lateinit var btnEnter: Button
    private val validId = "71294912"
    private val validPass = "8508"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etId = findViewById(R.id.etId)
        etPass = findViewById(R.id.etPass)
        btnEnter = findViewById(R.id.btnEnter)

        btnEnter.setOnClickListener {
            val id = etId.text.toString()
            val pass = etPass.text.toString()

            if (id == validId && pass == validPass) {
                // Si el ID y la contraseña son correctos, iniciar la nueva actividad
                Toast.makeText(this@MainActivity, "ok", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, MenuActivity::class.java)
                startActivity(intent)
            } else {
                // Si el ID o la contraseña son incorrectos, mostrar un mensaje de error
                Toast.makeText(this@MainActivity, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }
        }
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
}