package com.adambetz.voicerecorder

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recording_list.*

class RecordingListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recording_list)


        btn_returnToMain.setOnClickListener {
            val intent = Intent(this@RecordingListActivity, MainActivity::class.java)
            startActivity(intent)
        }

        btn_play.setOnClickListener {
            playRecording()
        }
    }

    private fun playRecording() {
        var mp = MediaPlayer()
        mp.setDataSource(intent.getStringExtra("path"))
        mp.prepare()
        mp.start()
    }
}