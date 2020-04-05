package com.tuli.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b3.setOnClickListener(arithmatioOperator);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Minus Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    View.OnClickListener arithmatioOperator=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "multiply clicked", Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "plus clicked", Toast.LENGTH_SHORT).show();
    }
}
