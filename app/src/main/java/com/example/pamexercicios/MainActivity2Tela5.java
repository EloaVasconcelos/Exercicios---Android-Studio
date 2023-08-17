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

          // instânciando as variáveis
        Button btnvoltar = (Button) findViewById(R.id.btnvoltar);
        Button btnfinalizar = (Button) findViewById(R.id.btnfinalizar);
        CheckBox cbcachorroquente = findViewById(R.id.cbcachorroquente);
        CheckBox cbrefri = findViewById(R.id.cbrefri);
        CheckBox cbsobre = findViewById(R.id.cbsobre);
        EditText qtd1 = findViewById(R.id.qtd1);
        EditText qtd2 = findViewById(R.id.qtd2);
        EditText qtd3 = findViewById(R.id.qtd3);
        TextView txtvalor = findViewById(R.id.txtvalor);


        // Definindo um Listener para o botão calcular, começando a programar o botão
          btnfinalizar.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v2) {

       // Criando variáveis para receberem valores, de inicio essas váriaveis recebem 0 como valor
        double valorTotal1 = 0;
        double valorTotal2 = 0;
        double valorTotal3 = 0;
        double valorFinal = 0;

       // O código a seguir serve para verifcar se cada check box foi "clicada" ou "escolhida"
        // A cada if uma checkbox é verificada de acordo com o id atribuido a mesma
        // Se uma checkbox for "escolhida o valor digitado na edittext é "extraido" pelo (.getText), resultando em um calculo
       // A string inserida é convertida para um número de valor inteiro (parse.int)
        //  Em seguida o calculo= qtd (qualtidade) * (valor de cada produto)

                  // Check Box do cachorrro quente
        if (cbcachorroquente.isChecked()) {
            valorTotal1 = Integer.parseInt(qtd1.getText().toString()) * 2.0;
        }
        //Check Box do Refrigerante
        if (cbrefri.isChecked()) {
            valorTotal2 = Integer.parseInt(qtd2.getText().toString()) * 2.50;
        }
        // Check Box da Sobremessa
        if (cbsobre.isChecked()) {
            valorTotal3= Integer.parseInt(qtd3.getText().toString()) * 1.50;
        }

        // O calculo final irá juntar (Somar) todos os calculas em cada check box (valor do produto*quantidade)

        valorFinal=valorTotal1+valorTotal2+valorTotal3;

        // Exibindo o valor total na TextView, definindo um formado, 'frase' e inserindo a variavel que recebe o valor final do pedido
                  // O metodo String.format("%2f", variavel) serve para definir um número (resultado) com 2 casas decimais (ponto flutuante)
        txtvalor.setText("Valor total: R$" + String.format("%.2f", valorFinal));
    }
});



          // programando uma intent que volta para a tela inicial do projeto
        // Nome da intent: voltar
        btnvoltar.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View v){
        Intent voltar = new Intent(MainActivity2Tela5.this, MainActivity.class);
        startActivity(voltar);
         }
       });
    }
}


