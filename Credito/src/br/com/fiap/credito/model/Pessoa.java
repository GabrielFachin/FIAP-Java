package br.com.fiap.credito.model;

public class Pessoa {
  private  String nome;
  private  int idade;
  private  Endereco endereco;



  Pessoa(String nome) {
      this.nome = nome;

  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
