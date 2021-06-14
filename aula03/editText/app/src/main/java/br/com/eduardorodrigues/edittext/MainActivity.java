package br.com.eduardorodrigues.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  A activity (tela) inicia capturando o id do elemento tipo EditText*/
        editText = findViewById(R.id.editText);
    }

    //  Chamado quando o button é clicado
    public void onClick(View view) {
        /*  Ao pressionar o botão aparece a mensagem: "Você escreveu" acompanhado do que foi digitado
            pelo usuário*/
        String txt = editText.getText().toString();
        Toast toast = Toast.makeText(this, "Você escreveu: " + txt, Toast.LENGTH_SHORT);
        toast.show();
    }
}