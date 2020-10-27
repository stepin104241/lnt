package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName);
    }

    public void clickHandler(View view) {
        switch (view.getId()) {
            case R.id.buttonlogin:
                String name = nameEditText.getText().toString();
                Toast.makeText(this, "Welcome to android " + name, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttoncancel:
                Toast.makeText(this, "cancelled", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}