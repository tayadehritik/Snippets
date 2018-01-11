package com.example.d00admin.bluetoothandwifi;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    BluetoothAdapter ba;
    WifiManager wi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ba = BluetoothAdapter.getDefaultAdapter();
        wi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    ba.enable();
                    wi.setWifiEnabled(true);
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();

                }
                else{
                    ba.disable();
                    wi.setWifiEnabled(false);
                    Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
