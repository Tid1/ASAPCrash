package com.example.asapgetinstancecrash;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        BluetoothSchach.initializeASAPExampleApplication(this);
        this.finish();
        this.startActivity(new Intent(this, MainActivity.class));
    }
}
