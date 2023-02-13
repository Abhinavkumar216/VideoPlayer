package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
   VideoView videoView;
    String videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
//        videoView2 = findViewById(R.id.videoView2);

//         from local storage
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.quizwalla);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);

        videoView.setMediaController(mc);

        // Display Video from Internet

//        Uri uri = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
//        videoView2.setVideoURI(uri);
//
//        MediaController mc2 = new MediaController(this);
//        mc2.setAnchorView(videoView2);
//        mc2.setMediaPlayer(videoView2);
//        videoView2.setMediaController(mc2);
//        videoView2.start();



    }
}