package br.com.eduardorodrigues.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Atributos da activity
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  A activity (tela) inicia capturando o id do elemento tipo ListView
        listView = findViewById(R.id.listView);

        AdapterView.OnItemClickListener itemClickListener = (listView, view, position, id) -> {
            TextView textView = (TextView) view;
            Toast.makeText(MainActivity.this, "Você selecionou a " + textView.getText().toString() + " de indíce " + (position+1), Toast.LENGTH_SHORT).show();
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}