public class Tenis {

    String cor;
    String modelo;
    int tamanho;
    double preco;
    boolean disponivel;

    void aumentarPreco(float porcentagem) {
        preco += preco * porcentagem / 100; // preco = preco + preco*porcentagem/100;
    }

    double aplicarDesconto(float porcentagem){

        double valorDesconto;

        valorDesconto = preco - preco * porcentagem/100;

        return valorDesconto;

    }

}
