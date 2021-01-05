package com.example.asapgetinstancecrash;

import android.os.Bundle;
import net.sharksystem.asap.android.apps.ASAPActivity;

public class InitActivity extends ASAPActivity {
    public InitActivity() {
        super(BluetoothSchach.getInstance());
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }*/
}
