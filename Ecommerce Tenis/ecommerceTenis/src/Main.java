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
        System.out.println("Agora digie a cor");

        //var.propiedade = variavel.nextDado
        tenis.cor = leitura.next();

        System.out.println("Modelo: ");
        tenis.modelo = leitura.next();

        System.out.println("Preço: ");
        tenis.preco = leitura.nextInt();

        System.out.println("Disponibilidade: ");
        tenis.disponivel = leitura.nextBoolean();




        System.out.println("o seu tênis de cor: " + tenis.cor + "modelo " + tenis.modelo + "tamanho " +tenis.tamanho + ",custo " +tenis.preco + "está disponivel? " +tenis.disponivel);

    }

}


