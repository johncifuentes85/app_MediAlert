package com.example.app_medialert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.SearchView
import androidx.fragment.app.Fragment

class Web_Fragment : Fragment() {

    private lateinit var webView: WebView
    private lateinit var searchView: SearchView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web, container, false)
        // Inicializar el WebView
        webView = view.findViewById(R.id.webView)
        // Habilitar la navegación dentro del WebView
        webView.webViewClient = WebViewClient()
        // Inicializar el SearchView
        searchView = view.findViewById(R.id.searchView)

        // Agregar un Listener al SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Cuando se envía la consulta de búsqueda
                query?.let {
                    val url = "https://www.google.com/search?q=$it"
                    webView.loadUrl(url)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Manejar cambios en el texto de búsqueda si es necesario
                return false
            }
        })
        return view
    }
}

