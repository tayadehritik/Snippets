package com.example.d00admin.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button speak;
    TextToSpeech speech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                speech.setSpeechRate(0.1f);
                speech.setPitch(4.09f);
            }
        });
        text = (EditText) findViewById(R.id.text1);
        speak = (Button) findViewById(R.id.speak);
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speech.speak(text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }
}
