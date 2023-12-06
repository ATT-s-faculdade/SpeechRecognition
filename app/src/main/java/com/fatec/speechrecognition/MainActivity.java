package com.fatec.speechrecognition;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView microphoneImageView;
    private boolean isMicrophoneOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        microphoneImageView = findViewById(R.id.mic);

        // Adicione um listener de clique ao ImageView
        microphoneImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of the microphone
                isMicrophoneOn = !isMicrophoneOn;

                // Change the image based on the microphone state
                if (isMicrophoneOn) {
                    microphoneImageView.setImageResource(R.drawable.opened_mic);
                } else {
                    microphoneImageView.setImageResource(R.drawable.block_mic);
                }
            }
        });
    }
}
