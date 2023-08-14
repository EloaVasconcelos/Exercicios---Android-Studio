package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2Tela5 extends AppCompatActivity {


    // Declarando os elementos de tela e seus ID's
    CheckBox cbcachorroquente;
    CheckBox cbrefri;
    CheckBox cbsobre;
    EditText qtd1;
    EditText qtd2;
    EditText qtd3;
    Button btnvoltar;
    TextView txtvalor;
    Button btnfinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela5);


        Button btnvoltar = (Button) findViewById(R.id.btnvoltar);
        Button btnfinalizar = (Button) findViewById(R.id.btnfinalizar);
        CheckBox cbcachorroquente = findViewById(R.id.cbcachorroquente);
        CheckBox cbrefri = findViewById(R.id.cbrefri);
        CheckBox cbsobre = findViewById(R.id.cbsobre);
        EditText qtd1 = findViewById(R.id.qtd1);
        EditText qtd2 = findViewById(R.id.qtd2);
        EditText qtd3 = findViewById(R.id.qtd3);
        TextView txtvalor = findViewById(R.id.txtvalor);


        // Definindo um Listener para o botão calcular
          btnfinalizar.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v2) {


        double valorTotal1 = 0;
        double valorTotal2 = 0;
        double valorTotal3 = 0;
        double valorFinal = 0;


        if (cbcachorroquente.isChecked()) {
            valorTotal1 = Integer.parseInt(qtd1.getText().toString()) * 2.0;
        }
        if (cbrefri.isChecked()) {
            valorTotal2 = Integer.parseInt(qtd2.getText().toString()) * 2.50;
        }
        if (cbsobre.isChecked()) {
            valorTotal3= Integer.parseInt(qtd3.getText().toString()) * 1.50;
        }

        valorFinal=valorTotal1+valorTotal2+valorTotal3;

        // Exibindo o valor total na TextView
        txtvalor.setText("Valor total: R$" + String.format("%.2f", valorFinal));
    }
});

        btnvoltar.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View v){
        Intent voltar = new Intent(MainActivity2Tela5.this, MainActivity.class);
        startActivity(voltar);
         }
       });
    }
}


