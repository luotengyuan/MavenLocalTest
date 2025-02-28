package com.lois.mavenlocaltest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lois.aarlib.AarUtils;
import com.lois.jarlib.JarUtils;

public class MainActivity extends AppCompatActivity {

    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_test = findViewById(R.id.tv_test);
        Button btn_test_aar = findViewById(R.id.btn_test_aar);
        btn_test_aar.setOnClickListener(v -> {
            tv_test.setText(AarUtils.getString());
        });
        Button btn_test_jar = findViewById(R.id.btn_test_jar);
        btn_test_jar.setOnClickListener(v -> {
            tv_test.setText(JarUtils.getString());
        });
    }
}