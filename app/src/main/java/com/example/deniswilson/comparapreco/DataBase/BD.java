package com.example.deniswilson.comparapreco.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by denis.wilson on 20/11/2017.
 */

public class BD extends SQLiteOpenHelper{

    private static final String NOME_BD = "comercios";
    private static final int VERSAO_BD = 1;

    public static final String TABELA_SUPERMERCADO = "supermercado";
    public static final String COLUNA_IDS = "_id"; /*Chave primária para tabela supermercado*/
    public static final String COLUNA_CODIGO_SUPERMERCADO = "codigo_supermercado";
    public static final String COLUNA_NOME_SUPERMERCADO = "nome_supermercado";

    public static final String TABELA_PRODUTO = "produto";
    public static final String COLUNA_IDP = "_id"; /*Chave primária para tabela produto*/
    public static final String COLUNA_CODIGO_PRODUTO = "codigo_empresa";
    public static final String COLUNA_PRECO_PRODUTO = "contato";


    public BD(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL(
                " CREATE TABLE IF NOT EXISTS "
                        + TABELA_SUPERMERCADO + " ( "
                        + COLUNA_IDS + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
                        + COLUNA_CODIGO_SUPERMERCADO + " TEXT, "
                        + COLUNA_NOME_SUPERMERCADO + " TEXT " + " ) "
        );

        bd.execSQL(
                " CREATE TABLE IF NOT EXISTS "
                        + TABELA_PRODUTO + " ( "
                        + COLUNA_IDP + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
                        + COLUNA_CODIGO_PRODUTO + " TEXT, "
                        + COLUNA_PRECO_PRODUTO + " TEXT " + " ) "
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*
        * Destruindo as tabelas, e construindo novamente caso haja atualização de banco de dados.
        * */
        db.execSQL("drop table "+TABELA_SUPERMERCADO+ " ");
        db.execSQL("drop table "+TABELA_PRODUTO+ " ");
        onCreate(db);
    }
}
