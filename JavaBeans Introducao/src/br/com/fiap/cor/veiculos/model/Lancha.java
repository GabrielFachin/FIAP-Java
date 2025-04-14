package br.com.fiap.cor.veiculos.model;

public class Lancha {

   private String modelo;
   private int quantidadeLugares;
   private double comprimento;
   private int anoFabricacao;
   private Cor cor;
   private int quantidaeMotores;

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public double getComprimento() {
        return comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public int getQuantidaeMotores() {
        return quantidaeMotores;
    }




    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setQuantidaeMotores(int quantidaeMotores) {
        this.quantidaeMotores = quantidaeMotores;
    }
}
