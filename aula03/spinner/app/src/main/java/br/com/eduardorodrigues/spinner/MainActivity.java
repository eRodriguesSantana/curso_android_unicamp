package br.com.eduardorodrigues.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }

    //  Chamado quando o button é clicado
    public void onClick(View view) {
        /*  Verifica o que foi selecionado entre as opções da caixa de seleção (spinner) e exibe na tela através do Toast*/
        String string = String.valueOf(spinner.getSelectedItem());
        int position = spinner.getSelectedItemPosition();
        Toast.makeText(this, "Você selecionou awwwww " + string + " de indíce " + (position+1), Toast.LENGTH_SHORT).show();
    }
}