package com.example.app_medialert

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.fragment.app.Fragment


class Video_Fragment : Fragment() {

    private lateinit var videoView: VideoView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video, container, false)

        videoView = view.findViewById(R.id.videoView)

        // Cargar el video desde la carpeta raw
        val videoPath = "android.resource://" + requireActivity().packageName + "/" + R.raw.medialert1
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        // Iniciar la reproducción del video
        videoView.start()

        return inflater.inflate(R.layout.fragment_video, container, false)
    }
}