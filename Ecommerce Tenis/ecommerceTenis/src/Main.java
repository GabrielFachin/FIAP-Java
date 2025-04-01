//importação do construtor Scanner
import java.util.Scanner;

//inicialização da main
public class Main {

    public static void main(String[] args) {

        //inicialização do objeto tenis, usando a
        // formatação: Classe var = new (inicializador de objetos) Classe;
        Tenis tenis = new Tenis();


        //inicialização do Scanner utilizando a
        // formatação: Classe var = new classe(método, nesse caso, input pro sistema)
        Scanner leitura = new Scanner(System.in);


        //print (sout)

        System.out.println("Digite o tamanho do tênis: ");

        //var.propiedade = variavel(que mantém o scanner).nextDado
        // (como por exemplo: próximo Int, próxima Linha.
        tenis.tamanho = leitura.nextInt();

        //sout
        System.out.println("Agora digite a cor");

        //var.propiedade = variavel.nextDado
        tenis.cor = leitura.next();


        System.out.println("Preço: ");
        tenis.preco = leitura.nextInt();


        //Aumento de preço usando funções
        System.out.println("Insira aqui o aumento em porcentagem");

        //objeto.método(parametro/arg) obj(scanner).nextDado
        tenis.aumentarPreco(leitura.nextFloat());

        //Exibir o valor atualizado do tenis
        System.out.println("Valor atualizado: " + tenis.preco);


        //Salva o return do método de desconto na váriavel valor, após o Scanner se chamado.
        System.out.println("Desconto a ser aplicado: ");
        double valor = tenis.aplicarDesconto(leitura.nextFloat());

        System.out.println("Valor final: " + valor);


    }

}


