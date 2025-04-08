package br.com.fiap.biblioteca.model;

public class Livro {

    public String titulo;
    int paginas;
    boolean disponivel;



    void alocar(){

        disponivel = false;

    }

    void receber(){

        disponivel = true;

    }
}
