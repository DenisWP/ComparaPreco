package com.example.deniswilson.comparapreco.DataBase;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.deniswilson.comparapreco.Produto;
import com.example.deniswilson.comparapreco.Supermercado;

/**
 * Created by denis.wilson on 20/11/2017.
 */

public class Interacoes {

    private SQLiteDatabase conexao;

    public Interacoes(SQLiteDatabase conexao){
        this.conexao = conexao;
    }



    public void InserirSupermercado (Supermercado supermercado){
        ContentValues dadosSupermercado = new ContentValues();

        /*Os supermercados vou colocar direto*/

    }

    public void InserirProduto (Produto produto){
        ContentValues dadosProdutos = new ContentValues();

        dadosProdutos.put(BD.COLUNA_CODIGO_PRODUTO, produto.getCodProduto());
        dadosProdutos.put(BD.COLUNA_PRECO_PRODUTO, produto.getPrecoProduto());



    }

}
