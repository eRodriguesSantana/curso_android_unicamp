package br.com.eduardorodrigues.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private CheckBox checkBox_1;
    private CheckBox checkBox_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  A activity (tela) inicia capturando o id dos elementos tipo CheckBox*/
        checkBox_1 = findViewById(R.id.checkbox_1);
        checkBox_2 = findViewById(R.id.checkbox_2);
    }

    //  Chamado quando o button é clicado
    public void onClick(View view) {
        /*  Recebe as instâncias das checkbox*/
        boolean checked1 = checkBox_1.isChecked();
        boolean checked2 = checkBox_2.isChecked();

        //  Verifica o que foi ou não selecionado das checkbox e exibe na tela através do Toast
        if(checked1 && checked2) {
            Toast.makeText(this, "Você selecionou as duas opções", Toast.LENGTH_SHORT).show();
        } else if(checked1) {
            Toast.makeText(this, "Você selecionou apenas a primeira opção", Toast.LENGTH_SHORT).show();
        } else if(checked2) {
            Toast.makeText(this, "Você selecionou apenas a segunda opção", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Você não selecionou nenhuma opção", Toast.LENGTH_SHORT).show();
        }
    }

    //  Chamado quando um dos checkbox é clicado
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_1:
                if(checked) {
                    Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(this, "Você cancelou a primeira opção", Toast.LENGTH_SHORT);
                }
                break;
            case R.id.checkbox_2:
                if(checked) {
                    Toast.makeText(this, "Você selecionou a segunda opção", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(this, "Você cancelou a segunda opção", Toast.LENGTH_SHORT);
                }
                break;
        }
    }
}