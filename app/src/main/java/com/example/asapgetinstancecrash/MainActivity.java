package com.example.asapgetinstancecrash;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends InitActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.crashButton);
        button.setOnClickListener(v-> provokeCrash());
    }

    private void provokeCrash(){
        Log.d("Pre-getInstance()", "Before calling my getInstance() method:"); //Returns instance of BluetoothSchach
        Log.d("MyInstance", BluetoothSchach.getInstance().toString());
        Log.d("Post-getInstance()", "After calling my getInstance() method");

        Log.d("PreGetASAPApplication()", "Before calling getASAPApplication()"); //call der ASAP library
        Log.d("ASAPInstance", BluetoothSchach.getASAPApplication().toString());
        Log.d("PostGetASAPApplication", "After calling getASAPApplication()");
    }
}
