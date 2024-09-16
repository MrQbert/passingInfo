package com.example.passinginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    String name;
    TextView n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        n=findViewById(R.id.displayResults);

        // Receiving all the variables sent from first Activity
        Intent intent= getIntent();
        name=intent.getStringExtra("name");
        n.setText(name);
    }
}