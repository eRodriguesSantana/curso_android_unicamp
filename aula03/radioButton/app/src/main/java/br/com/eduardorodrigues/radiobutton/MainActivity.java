package br.com.eduardorodrigues.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  A activity (tela) inicia capturando o id do elemento tipo RadioButton*/
        radioGroup = findViewById(R.id.radioGroup);
    }

    //  Chamado quando o button é clicado
    public void onClick(View view) {
        /*  Verifica o que foi selecionado entre os RadioButtons e exibe na tela através do Toast*/
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radio_1:
                Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_2:
                Toast.makeText(this, "Você selecionou a segunda opção", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //  Chamado quando um dos radio buttons é clicado
    public void onRadioButtonClick(View view) {
        String text = ((RadioButton) view).getText().toString();
        Toast.makeText(this, "Você selecionou a " + text, Toast.LENGTH_SHORT);
    }
}