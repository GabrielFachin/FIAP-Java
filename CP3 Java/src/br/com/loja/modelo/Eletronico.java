package br.com.loja.modelo;

public class Eletronico extends Produto {
    //Propiedades
   private String fabricante;
   private int armazenamento;





    //Getters and Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
