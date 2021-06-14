package br.com.eduardorodrigues.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  A activity (tela) inicia capturando o id do elemento tipo TextView e inicializando
            a varivael contatdor count*/
        textView = findViewById(R.id.textView);
        count = 0;
    }

    //  Chamado quando o button é clicado
    public void onClick(View view) {
        /*  Ao pressionar o botão aparece a mensagem: "Você pressionou o botão" acompanhado das
            vezes que o botão foi clicado*/
        count++;
        textView.setText("Você pressionou o botão: " + count);
    }
}