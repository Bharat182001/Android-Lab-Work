package com.example.buttonfunctionality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View v){
        Toast.makeText(this, "HI", Toast.LENGTH_SHORT).show();
    }
    public void disp(View v){
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}