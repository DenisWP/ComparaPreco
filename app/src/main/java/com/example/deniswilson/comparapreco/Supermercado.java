package com.example.deniswilson.comparapreco;

import java.io.Serializable;

/**
 * Created by denis.wilson on 30/11/2017.
 */

public class Supermercado implements Serializable {
    private long id;
    private String nome;

    public Supermercado (){
        id = 0;
    }

    public long getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String bairro) {
        this.nome = nome;
    }

}
