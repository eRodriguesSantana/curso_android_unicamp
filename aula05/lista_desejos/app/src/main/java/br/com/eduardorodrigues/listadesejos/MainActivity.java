package br.com.eduardorodrigues.listadesejos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TextView footer;
    private EditText desejo;
    private EditText preco;
    private CheckBox checkBox;

    private ArrayList<Desejo> desejos;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        desejo = findViewById(R.id.desejo);
        preco = findViewById(R.id.preco);
        checkBox = findViewById(R.id.checkBox);
        footer = findViewById(R.id.footer);

        desejos = new ArrayList<>();
        arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                desejos
        );
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemLongClickListener itemLongClickListener = new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> listview, View view, int position, long id) {
                final int localPosition = position;
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Remover desejo da lista")
                        .setMessage("Você realmente deseja remover o desejo selecionado da lista?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int wichButton) {
                                desejos.remove(localPosition);
                                arrayAdapter.notifyDataSetChanged();
                                updateFooter();
                            }
                        })
                        .setNegativeButton(android.R.string.no, null).show();
                return true;
            }
        };
        listView.setOnItemLongClickListener(itemLongClickListener);
    }

    public void updateFooter() {
        float total = 0;
        float urgente = 0;

        for(int i = 0; i<desejos.size(); i++) {
            Desejo desejo = desejos.get(i);
            if (desejo.isUrgente())
                urgente += desejo.getPreco();
            total += desejo.getPreco();
        }
        footer.setText("Total = " + total + " : Urgente = " + urgente);
    }

    public void addProduto(View view) {
        String nomeDesejo = desejo.getText().toString();
        boolean urgente = checkBox.isChecked();
        float valorDesejo = Float.parseFloat(preco.getText().toString());

        Desejo desejo = new Desejo(nomeDesejo, valorDesejo, urgente);
        desejos.add(desejo);
        arrayAdapter.notifyDataSetChanged();
        updateFooter();
    }
}