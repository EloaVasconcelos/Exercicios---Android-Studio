package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2Tela5 extends AppCompatActivity {

    Button btnvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela5);


        Button btnvoltar= (Button) findViewById(R.id.btnvoltar);

        btnvoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent voltar =new Intent(MainActivity2Tela5.this, MainActivity.class);
                startActivity(voltar);
            }
        });
    }
}

