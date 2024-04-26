package com.example.app_medialert

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment

class Video_Fragment : Fragment() {

    private lateinit var videoView: VideoView
    private lateinit var mediaController: MediaController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video, container, false)

        videoView = view.findViewById(R.id.videoView)

        // Cargar el video desde la carpeta raw
        val videoPath = "android.resource://" + requireActivity().packageName + "/" + R.raw.medialer
        val uri = Uri.parse(videoPath)

        // Especificar el tipo MIME del video
        videoView.setVideoURI(uri, mapOf("Content-Type" to "video/mp4"))

        // Iniciar la reproducción del video
        videoView.start()

        // Configurar MediaController
        mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videoView) // Anclar los controles al VideoView
        videoView.setMediaController(mediaController) // Asociar MediaController al VideoView

        return view
    }
}


