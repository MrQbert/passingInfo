package com.example.passinginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText n;
    EditText a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.userName);
        a=findViewById(R.id.userAge);
    }
    public void clickMe(View v){
            String name = n.getText().toString();
            String age = n.getText().toString();
        Intent i = new Intent(this,secondActivity.class);
        // in put extra your sending a variable from one java class/screen to another
        i.putExtra("name",name);
        i.putExtra("age",age);
        startActivity(i);

    }
}