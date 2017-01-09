package com.vehseri.rpttr42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textLoginAs;
    Button buttonAsTeacher, buttonAsPupil, buttonAsParent, buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setButtonBehavior();
    }
    private void initViews() {
        textLoginAs = (TextView)findViewById(R.id.textLoginAs);
        buttonAsPupil = (Button)findViewById(R.id.buttonAsPupil);
        buttonAsTeacher = (Button)findViewById(R.id.buttonAsTeacher);
        buttonAsParent = (Button)findViewById(R.id.buttonAsParent);
        buttonRegister = (Button)findViewById(R.id.buttonRegister);
    }
    /* обработка нажатия на кнопки teacher, pupil, parent, register */
    private void setButtonBehavior(){
        buttonAsPupil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.pupil, Toast.LENGTH_SHORT).show();
            }
        });
        buttonAsTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.teacher, Toast.LENGTH_SHORT).show();
            }
        });
        buttonAsParent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.parent, Toast.LENGTH_SHORT).show();
            }
        });
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.underconstruction, Toast.LENGTH_SHORT).show();
            }
        });
    }
}