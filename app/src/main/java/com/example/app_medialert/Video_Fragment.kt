package com.example.app_medialert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import android.widget.MediaController
import android.net.Uri


class Video_Fragment : Fragment() {
    private lateinit var videoView: VideoView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_video, container, false)
        videoView = view.findViewById(R.id.videoView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configura el URI del video (en este caso, desde los recursos de la aplicación)
        val videoUri = Uri.parse("android.resource://" + requireActivity().packageName + "/" + R.raw.MedicAlert_Cardio)

        // Establece el URI del video al VideoView
        videoView.setVideoURI(videoUri)

        // Crea un MediaController para controlar la reproducción del video
        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Comienza la reproducción del video
        videoView.start()
    }
}