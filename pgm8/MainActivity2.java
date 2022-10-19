package com.example.intentvaluepassing;

import static com.example.intentvaluepassing.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
 TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main2);
        tv1 = findViewById(R.id.t1);
        tv2 = findViewById(R.id.t2);

        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text1 = extra.getString("name1");
        tv1.setText(text);
        tv2.setText(text1);

    }

}