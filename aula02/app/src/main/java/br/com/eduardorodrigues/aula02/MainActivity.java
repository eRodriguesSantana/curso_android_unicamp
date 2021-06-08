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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int count;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  A activity (tela) inicia capturando o id do elemento tipo TextView e inicializando
            a varivael contatdor count
        textView = findViewById(R.id.textView);
        count = 0;*/

        /*  A activity (tela) inicia capturando o id do elemento tipo EditText */
        editText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        /*
            Ao pressionar o botão aparece a mensagem: "Você pressionou o botão"
        Toast toast = Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_SHORT);
        toast.show();*/

        /*  Ao pressionar o botão aparece a mensagem: "Você pressionou o botão" acompanhado das
            vezes que o botão foi clicado
        count++;
        textView.setText("Você pressionou o botão: " + count);*/

        /*  Ao pressionar o botão aparece a mensagem: "Você escreveu" acompanhado do que foi digitado
            pelo usuário */
        String txt = editText.getText().toString();
        Toast toast = Toast.makeText(this, "Você escreveu: " + txt, Toast.LENGTH_SHORT);
        toast.show();

    }
}