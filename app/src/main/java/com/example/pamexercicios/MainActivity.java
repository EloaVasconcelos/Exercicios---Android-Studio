package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnentar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnentar1=(Button)findViewById(R.id.btnentrar1);

        btnentar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View e){
                Intent entrar=new Intent(MainActivity.this, MainActivity2Tela2.class);
                startActivity(entrar);
            }
        });
    }
}