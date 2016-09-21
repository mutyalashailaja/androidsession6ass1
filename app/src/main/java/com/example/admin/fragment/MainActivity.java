package com.example.admin.fragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MessagePasser{

    TextView Tv;
    SimpleAddition simpleAddition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv=(TextView)findViewById(R.id.textview);
    }
    

    @Override
    public void OnMessage(String message) {

Tv.setText(message);

    }
}
