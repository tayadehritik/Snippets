package com.example.d00admin.call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText  mobile;
        Button  call;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            call = (Button) findViewById(R.id.call);
            mobile = (EditText) findViewById(R.id.mobile);
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mobile.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }
                    else if(mobile.getText().toString().length()!= 10){
                        Toast.makeText(MainActivity.this, "Enter 10 digits", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Intent i;
                        i= new Intent(Intent.ACTION_CALL);
                        i.setData(Uri.parse("tel:"+mobile.getText().toString()));
                        startActivity(i);
                    }
                }
            });
        }
}
