//Importa o scanner da biblioteca Java
import java.util.Scanner;

//abertura da classe
public class LeituraDados {

    //abertura da main
    public static void main(String[] args){

        //criar objeto responsavel por ler as informações
        Scanner leitor =  new Scanner(System.in);

        //print mensagem no terminal pedindo o valor
        System.out.println("Digite o valor do produto:");

        //crio uma variavel, falo para o scanner ler como float e salvar na variavel.
        float valor = leitor.nextFloat();

        System.out.println("Digite a quantidade de produtos desejada:");

        //Lê a quantidade do produto
        int quantidade = leitor.nextInt();


        //Exibir o valor total
        double preco = valor * quantidade;
        System.out.println("o preço a ser pago é: " + preco);



    }
}