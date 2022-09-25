package com.example.sumoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.ed1);
        t2=(EditText)findViewById(R.id.ed2);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
    }

    public void add(View v){
        String n1=t1.getText().toString();
        String n2=t2.getText().toString();

        if(n1.equals("") || n2.equals("")){
            Toast.makeText(this, "Please fill", Toast.LENGTH_SHORT).show();
        }
        else{
            int i=Integer.parseInt(n1);
            int j=Integer.parseInt(n2);
            int k=i+j;
            Toast.makeText(this, "Sum =" +k, Toast.LENGTH_LONG).show();
        }
    }

    public void sub(View v){
        String n1=t1.getText().toString();
        String n2=t2.getText().toString();
        if(n1.equals("") || n2.equals("")){
            Toast.makeText(this, "Please fill", Toast.LENGTH_LONG).show();
        }
        else{
            int i=Integer.parseInt(n1);
            int j=Integer.parseInt(n2);
            int k=i-j;
            Toast.makeText(this, "Subtraction =" +k, Toast.LENGTH_LONG).show();
        }
    }
}