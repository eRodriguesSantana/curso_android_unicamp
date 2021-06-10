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
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private TextView textView;
    private int count;
    private EditText editText;
    private CheckBox checkBox_1;
    private CheckBox checkBox_2;
    private RadioGroup radioGroup;
    private Spinner spinner;
    private ListView listView;

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

        /*  A activity (tela) inicia capturando o id dos elementos tipo CheckBox
        checkBox_1 = findViewById(R.id.checkbox_1);
        checkBox_2 = findViewById(R.id.checkbox_2);*/

        /*  A activity (tela) inicia capturando o id do elemento tipo RadioButton
        radioGroup = findViewById(R.id.radioGroup);*/

        /*  ---Start Spinner---
        //  A activity (tela) inicia capturando o id do elemento tipo Spinner (caixa de seleção de itens)
        spinner = findViewById(R.id.spinner);

        //  OnItemSelectedListener -> interface
        //  itemSelectedListener -> objeto criado da classe anônima OnItemSelectedListener()
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String txt = ((TextView) selectedItemView).getText().toString();
                //  Toast abaixo exibido no ato da execução do app, antes mesmo do usuário selecionar uma opção
                //Toast.makeText(MainActivity.this, "Você selecionou a " + txt + " de indíce " + (position+1), Toast.LENGTH_SHORT);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
            ---End Spinner--- */

        //  A activity (tela) inicia capturando o id do elemento tipo ListView
        listView = findViewById(R.id.listView);

        AdapterView.OnItemClickListener itemClickListener = (listView, view, position, id) -> {
            TextView textView = (TextView) view;
            Toast.makeText(MainActivity.this, "Você selecionou a " + textView.getText().toString() + " de indíce " + (position+1), Toast.LENGTH_SHORT).show();
        };
        listView.setOnItemClickListener(itemClickListener);
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

        /*  Recebe as instâncias das checkbox
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
        }*/

        /*  Verifica o que foi selecionado entre os RadioButtons e exibe na tela através do Toast
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radio_1:
                Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_2:
                Toast.makeText(this, "Você selecionou a segunda opção", Toast.LENGTH_SHORT).show();
                break;
        }*/

        /*  Verifica o que foi selecionado entre as opções da caixa de seleção (spinner) e exibe na tela através do Toast
        String string = String.valueOf(spinner.getSelectedItem());
        int position = spinner.getSelectedItemPosition();
        Toast.makeText(this, "Você selecionou awwwww " + string + " de indíce " + (position+1), Toast.LENGTH_SHORT).show();*/


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

    //  Chamado quando um dos radio buttons é clicado
    public void onRadioButtonClick(View view) {
        String text = ((RadioButton) view).getText().toString();
        Toast.makeText(this, "Você selecionou a " + text, Toast.LENGTH_SHORT).show();
    }
}