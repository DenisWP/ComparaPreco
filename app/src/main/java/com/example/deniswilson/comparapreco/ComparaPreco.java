package com.example.deniswilson.comparapreco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


public class ComparaPreco extends AppCompatActivity {

    EditText edtCodigoBarras, edtPreco;
    Button btnSalvar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_preco);

        edtCodigoBarras = (EditText) findViewById(R.id.edtCodigoBarra);
        edtPreco = (EditText) findViewById(R.id.edtPreco);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);
    }

}
