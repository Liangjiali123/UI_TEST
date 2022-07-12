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
                //UI
                Intent intent1 = new Intent(MainActivity.this,firstActivity.class);
                startActivity(intent1);
                break;
            case R.id.second:
                //广播
                // AlertDialog.Builder builder = new AlertDialog.Builder(this);
                Intent intent2 = new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent2);
                break;
            case R.id.third:
                //数据存储
                Intent intent3 = new Intent(MainActivity.this,thirdActivity.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}