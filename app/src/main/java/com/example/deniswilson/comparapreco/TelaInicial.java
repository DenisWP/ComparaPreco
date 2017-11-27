package com.example.deniswilson.comparapreco;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import com.example.deniswilson.comparapreco.DataBase.BD;
import com.example.deniswilson.comparapreco.DataBase.Interacoes;

public class TelaInicial extends AppCompatActivity {

    private Interacoes interacoes;
    private BD database;
    private SQLiteDatabase conexao;

    Spinner spnSupermercado;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        spnSupermercado = (Spinner) findViewById(R.id.spnSupermercado);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        try{
            database = new BD(this); // Criando a referencia do banco.
            conexao = database.getWritableDatabase();
            interacoes = new Interacoes(conexao);

        }catch(Exception e){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro !" + e.getMessage()); //Retornando o erro que ocorrer.
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
    }


    /**
     * Created by denis.wilson on 27/11/2017.
     */

    public static class CadastroPreco {
    }
}
