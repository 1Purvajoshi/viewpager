package com.example.purvajoshi.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(getApplicationContext(), "Button Pressed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SlideActivity.class);
                startActivity(intent);


        }


    }
}
