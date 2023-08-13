package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2Tela3 extends AppCompatActivity {
    Button btnentrar2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela3);

        Button btnentar2 = (Button) findViewById(R.id.btnentrar2);

        btnentar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View t){
                Intent entrar2=new Intent(MainActivity2Tela3.this, MainActivity2Tela4.class);
                startActivity(entrar2);
            }
        });
    }
}


        
    