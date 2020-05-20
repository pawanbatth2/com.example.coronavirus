package com.example.coronavirus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_check_out extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(activity_check_out.this, LoginActivity.class);
                startActivity(i);
            }

            private void startActivity(Intent i) {
            }
        }, 3000);
    }
    public void onClick(View view) {
    }
}