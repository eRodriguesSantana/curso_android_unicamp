package br.com.eduardorodrigues.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        /*  Ao pressionar o botão aparece a mensagem: "Você pressionou o botão"*/
        Toast toast = Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_SHORT);
        toast.show();
    }
}