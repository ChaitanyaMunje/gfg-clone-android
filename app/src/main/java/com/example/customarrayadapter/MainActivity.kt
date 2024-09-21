package com.example.customarrayadapter

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.recyclerview.widget.GridLayoutManager


class MainActivity : AppCompatActivity() {


    private lateinit var player: ExoPlayer
    private lateinit var playerView: PlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        playerView = findViewById(R.id.player_view);

        player = ExoPlayer.Builder(this).build()
        playerView.player = player
        val uri =
            Uri.parse("https://media.geeksforgeeks.org/wp-content/uploads/20201217163353/Screenrecorder-2020-12-17-16-32-03-350.mp4")
        val mediaItem = MediaItem.fromUri(uri)
        player!!.setMediaItem(mediaItem)
        player!!.prepare()
        player!!.playWhenReady = true


    }
}