package com.example.videoplayercourseraempvi

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
//import com.example.videoplayercourseraempvi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        //setContentView(android.R.layout.main_activity)

        val videoView = findViewById<VideoView>(R.id.testView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri:Uri = parse(
            "android.resource://" + packageName + "/raw/tensor"
        )
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}