package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button first,second;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initi();
    }

    private void initi() {
        first = findViewById(R.id.first);
        first.setOnClickListener(this);
        second = findViewById(R.id.second);
        second.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.first:
                Intent intent = new Intent(MainActivity.this,firstActivity.class);
                startActivity(intent);
                break;
            case R.id.second:
                // AlertDialog.Builder builder = new AlertDialog.Builder(this);
            default:
                break;
        }
    }
}