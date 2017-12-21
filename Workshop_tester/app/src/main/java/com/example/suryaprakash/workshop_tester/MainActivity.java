package com.example.suryaprakash.workshop_tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toaster(View view) {
        Toast.makeText(this,R.string.toast_message,Toast.LENGTH_LONG).show();
        return;
    }

    public void toaster_french ( View view ) {
        Toast.makeText(this,"French Toast ", Toast.LENGTH_SHORT).show();
        return;
    }
}