package br.com.loja.modelo;

public class Livro extends Produto {
    //Propiedades
   private String editora;
   private String autor;







   //Getters and Setters
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
