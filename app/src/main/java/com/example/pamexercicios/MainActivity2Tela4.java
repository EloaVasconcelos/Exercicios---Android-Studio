package com.example.pamexercicios;

import static com.example.pamexercicios.R.id.btnproximo2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2Tela4 extends AppCompatActivity {
    Button btnproximo2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela4);

        Button btnproximo2= (Button) findViewById(R.id.btnproximo2);

        btnproximo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View t){
                Intent entrar2 =new Intent(MainActivity2Tela4.this, MainActivity2Tela5.class);
                startActivity(entrar2);
            }
        });
    }
}


