package br.com.juliorgm.livrosandroid.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.io.Serializable;

/**
 * Created by Julio on 27/03/2018.
 */

public class Livro extends SugarRecord implements Serializable{

    private Long id;



    @Unique
    private String isbn;
    private String titulo;
    private String edicao;

    @Override
    public Long getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return isbn + " " + titulo;
    }
}
