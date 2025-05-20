package br.com.fiap.view;

import br.com.fiap.model.Produto;

public class Main  {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setPreco(100.00);

        //System.out.printf("%.2f",produto.calcularDesconto(10));
        System.out.printf("%.2f",produto.calcularDesconto(7,false));

    }
}
