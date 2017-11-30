package com.example.deniswilson.comparapreco;

import java.io.Serializable;

/**
 * Created by denis.wilson on 30/11/2017.
 */

public class Produto implements Serializable {

    private long id;
    private String data, codProduto, precoProduto, codConcorrente;

    public void Produto() {
        id = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getData(){
        return data;
    }

    public void setData(){
        this.data = data;
    }

    public String getCodProduto(){
        return codProduto;
    }

    public void setCodProduto(){
        this.codProduto = codProduto;
    }

    public String getPrecoProduto(){
        return precoProduto;
    }

    public void setPrecoProduto(){
        this.precoProduto = precoProduto;
    }

    public String getCodConcorrente(){
        return codConcorrente;
    }

    public void setCodConcorrente(){
        this.codConcorrente = codConcorrente;
    }



}
