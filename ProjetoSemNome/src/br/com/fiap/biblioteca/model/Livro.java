package br.com.fiap.biblioteca.model;

public class Livro {

    private String titulo;
    private int paginas;
    private boolean disponivel;


    public String getTitulo(){
        return titulo;

    }

    public void setTitulo(String titulo){

        this.titulo = titulo;
    }





    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){

        this.paginas = paginas;
    }





    public boolean isDisponivel(){

        return disponivel;
    }

    public void setDisponivel(boolean disponivel){

        this.disponivel = disponivel;
    }

}
