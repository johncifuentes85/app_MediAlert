package com.example.app_medialert

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.Toast

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val ibPerfil = findViewById<ImageButton>(R.id.ibPerfil)
        val ibImage = findViewById<ImageButton>(R.id.ibImage)
        val ibVideo = findViewById<ImageButton>(R.id.ibVideo)
        val ibWeb = findViewById<ImageButton>(R.id.ibWeb)
        val ibAlert = findViewById<ImageButton>(R.id.ibAlert)

        ibPerfil.setOnClickListener {
            // Mostrar un mensaje Toast cuando se hace clic en el ImageButton
            Toast.makeText(this, "¡Has hecho clic en perfil!", Toast.LENGTH_SHORT).show()
        }

        ibImage.setOnClickListener {
            // Mostrar un mensaje Toast cuando se hace clic en el ImageButton
            Toast.makeText(this, "¡Has hecho clic en imagenes!", Toast.LENGTH_SHORT).show()
        }

        ibVideo.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val fragment = Video_Fragment()
            fragmentTransaction.replace(R.id.layoutInfo, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            Toast.makeText(this, "¡Has hecho clic en video!", Toast.LENGTH_SHORT).show()
        }

        ibWeb.setOnClickListener {
            // Mostrar un mensaje Toast cuando se hace clic en el ImageButton
            Toast.makeText(this, "¡Has hecho clic en web!", Toast.LENGTH_SHORT).show()
        }

        ibAlert.setOnClickListener {
            // Mostrar un mensaje Toast cuando se hace clic en el ImageButton
            Toast.makeText(this, "¡Has hecho clic en alerta!", Toast.LENGTH_SHORT).show()
        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}