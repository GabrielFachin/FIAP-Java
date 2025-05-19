package br.com.loja.modelo;

public class Produto {
    //Propiedades
   private String nome;
   private String descricao;
   private double preco;
   private int quantidade;





   //Métodos

    public double aplicarDesconto(int quantidade, int preco) {
        double valor = preco;
       if (quantidade > 50) {
           valor -= preco * 0.1;
       }
        else if(quantidade > 10) {
           valor -= preco * 0.05;
       }



        return 0;
    }



    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
