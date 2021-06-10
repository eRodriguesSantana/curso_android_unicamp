package br.com.eduardorodrigues.aula02;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import br.com.eduardorodrigues.aula02.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int count;
    private EditText editText;
    private CheckBox checkBox_1;
    private CheckBox checkBox_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  A activity (tela) inicia capturando o id do elemento tipo TextView e inicializando
            a varivael contatdor count
        textView = findViewById(R.id.textView);
        count = 0;*/

        /*  A activity (tela) inicia capturando o id do elemento tipo EditText
        editText = findViewById(R.id.editText);*/

        /*  A activity (tela) inicia capturando o id dos elementos tipo CheckBox*/
        checkBox_1 = findViewById(R.id.checkbox_1);
        checkBox_2 = findViewById(R.id.checkbox_2);
    }

    //  Chamado quando o button é clicado
    public void onClick(View view) {
        /*  Ao pressionar o botão aparece a mensagem: "Você pressionou o botão"
        Toast toast = Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_SHORT);
        toast.show();*/

        /*  Ao pressionar o botão aparece a mensagem: "Você pressionou o botão" acompanhado das
            vezes que o botão foi clicado
        count++;
        textView.setText("Você pressionou o botão: " + count);*/

        /*  Ao pressionar o botão aparece a mensagem: "Você escreveu" acompanhado do que foi digitado
            pelo usuário
        String txt = editText.getText().toString();
        Toast toast = Toast.makeText(this, "Você escreveu: " + txt, Toast.LENGTH_SHORT);
        toast.show();*/

        /*  Recebe as instâncias das checkbox*/
        boolean checked1 = checkBox_1.isChecked();
        boolean checked2 = checkBox_2.isChecked();

        /*  Verifica o que foi ou não selecionado e exibe na tela através do Toast*/
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