package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2Tela2 extends AppCompatActivity {
   Button btnproximo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela2);

        btnproximo = (Button)findViewById(R.id.btnproximo);

        btnproximo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p){
                Intent proximo =new Intent(MainActivity2Tela2.this, MainActivity2Tela3.class);
                startActivity(proximo);
            }
        });
    }
}