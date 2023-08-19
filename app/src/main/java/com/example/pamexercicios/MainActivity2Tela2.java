package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2Tela2 extends AppCompatActivity {

    // Declarando os elementos de tela e seus id's
    Button btnproximo;
    EditText txtextras;
    EditText txtfaltas;
    Button btnverificar;
    TextView txtresult;
    TextView txthoras;
    TextView txthoras2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela2);

        // Instãnciando as variáveis dos elementos de tela
        txtextras = findViewById(R.id.txtextras);
        txtfaltas = findViewById(R.id.txtfaltas);
        btnverificar = findViewById(R.id.btnverificar);
        txthoras = findViewById(R.id.txthoras);
        txthoras2 = findViewById(R.id.txthoras2);
        txtresult = findViewById(R.id.txtresult);
        btnproximo = findViewById(R.id.btnproximo);



        // Progamando o botão verificar
        btnverificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View h) {
                //  Criado variáveis para receberem o valores digitados nas caixas de texto e Convertendo para Double
                double Me = Double.parseDouble(txtextras.getText().toString());
                double Mf = Double.parseDouble(txtfaltas.getText().toString());

                // Os minutos digitados são transformados em horas e imprimidos na tela
                double Horas = Me/60;
                txthoras.setText("Horas Extras: "+ Horas);

                double Horas2 = Mf/60;
                txthoras2.setText("Horas Faltas: "+ Horas2);


                // Pegando os valores digitados e fazendo o cálculo
                 double H = Me - (2.0 / 3.0) * Mf;
                // Criando a estrutura if e else para verificação dos prêmios, após verificar serão colocados da TextView
                // Em seguida mostrados na tela
                if (H > 2400) {
                    txtresult.setText("O prêmio é de R$500,00");
                }
                else if (H >= 1801 && H <= 2400) {
                    txtresult.setText("O prêmio é de R$400,00");

                }
                else if (H >= 1201 && H <= 1800) {
                    txtresult.setText("O prêmio é de R$300,00");

                }
                else if (H >= 600 && H <= 1200) {
                    txtresult.setText("O prêmio é de R$200,00");

                }
                else if (H < 600){
                    txtresult.setText("O prêmio é de R$100,00");

                }

            }

        });


        // Programando o botão proximo pra ir para a proxima tela
        btnproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View p) {
                Intent proximo = new Intent(MainActivity2Tela2.this, MainActivity2Tela3.class);
                startActivity(proximo);
            }
        });
    }
}