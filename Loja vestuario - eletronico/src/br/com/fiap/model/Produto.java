package br.com.fiap.model;

public class Produto {
    double preco;
    int quantidade;
    String nome;



    public double calcularDesconto(int porcentagem){
        double valor = this.preco;
        valor *= 1-(porcentagem / 100f);


        return valor;
    }

    public double calcularDesconto(int quantidade, boolean parcelado){
        double valor = this.preco;
        if (quantidade > 5){
            valor *= 1-(20 / 100f);
        }
        else
        {
            valor *= 1-(5 / 100f);
        }

        if(!parcelado){
            valor *= 1-(5 / 100f);
        }

        return valor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
