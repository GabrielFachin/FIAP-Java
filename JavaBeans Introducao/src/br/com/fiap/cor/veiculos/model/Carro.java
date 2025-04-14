package br.com.fiap.cor.veiculos.model;

public class Carro {


   private  String modelo;
   private  int quantidadeLugares;
   private  int quantidaddePortas;
   private  double comprimento;
   private  int anoFabricacao;
   private  Cor cor;
   private  String placa;
   private  float motor = 1.0f;

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public int getQuantidaddePortas() {
        return quantidaddePortas;
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

    public float getMotor() {
        return motor;
    }

    public String getPlaca() {
        return placa;
    }





    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public void setQuantidaddePortas(int quantidaddePortas) {
        this.quantidaddePortas = quantidaddePortas;
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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
