package com.example.app_medialert

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.Toast

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View

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
            // Crea una instancia del fragmento
            val fragment = Perfil_Fragment()

            // Inicia la transacción para agregar el fragmento al layout
            supportFragmentManager.beginTransaction()
                .replace(R.id.layoutInfo, fragment) // Reemplaza el contenido del layout con el fragmento
                .addToBackStack(null) // Opcional: agrega la transacción a la pila de retroceso
                .commit()
        }

        ibImage.setOnClickListener {
            // Crea una instancia del fragmento
            val fragment = Image_Fragment()

            // Inicia la transacción para agregar el fragmento al layout
            supportFragmentManager.beginTransaction()
                .replace(R.id.layoutInfo, fragment) // Reemplaza el contenido del layout con el fragmento
                .addToBackStack(null) // Opcional: agrega la transacción a la pila de retroceso
                .commit()
        }

        ibAlert.setOnClickListener {
            // Crea una instancia del fragmento
            val fragment = Alert_Fragment()

            // Inicia la transacción para agregar el fragmento al layout
            supportFragmentManager.beginTransaction()
                .replace(R.id.layoutInfo, fragment) // Reemplaza el contenido del layout con el fragmento
                .addToBackStack(null) // Opcional: agrega la transacción a la pila de retroceso
                .commit()
        }

        ibVideo.setOnClickListener {
            // Crea una instancia del fragmento
            val fragment = Video_Fragment()

            // Inicia la transacción para agregar el fragmento al layout
            supportFragmentManager.beginTransaction()
                .replace(R.id.layoutInfo, fragment) // Reemplaza el contenido del layout con el fragmento
                .addToBackStack(null) // Opcional: agrega la transacción a la pila de retroceso
                .commit()
        }

        ibWeb.setOnClickListener {
            // Crea una instancia del fragmento
            val fragment = Web_Fragment()

            // Inicia la transacción para agregar el fragmento al layout
            supportFragmentManager.beginTransaction()
                .replace(R.id.layoutInfo, fragment) // Reemplaza el contenido del layout con el fragmento
                .addToBackStack(null) // Opcional: agrega la transacción a la pila de retroceso
                .commit()
        }





    }
}