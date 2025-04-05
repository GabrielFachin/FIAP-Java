import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        ContaCorrente conta = new ContaCorrente();
        Endereco endereco = new Endereco();

        System.out.println("Olá! por favor, digite seu nome!");
        cliente.nome = scan.nextLine();

        System.out.println("Certo," + cliente.nome + "Agora informe seu CPF: ");
        cliente.cpf = scan.nextLine();

        System.out.println("Agora precisamos dos dados do seu endereço, por favor, nos informe");
        System.out.println("seu Logradouro:");
        endereco.logradouro = scan.nextLine();

        System.out.println("seu Numero:");
        endereco.numero = scan.nextShort();

        System.out.println("seu Complemento:");
        endereco.complemento = scan.nextLine() + scan.next();

        System.out.println("Seu CEP");
        endereco.cep = scan.nextLine() + scan.next();

        System.out.println("vamos confirmar seus dados abaixo");
        System.out.println(cliente.retornarDados());
        System.out.println(endereco.retornarEndereco());
        System.out.println("verfique se seus dados estão corretos");


        System.out.println("Certo! você deseja fazer uma transferência de outro banco para sua nova conta? qual valor?");
        conta.depositar(scan.nextDouble());

        System.out.println("Agora, desejas sacar alguma quantidade? digite o valor");
        conta.retirar(scan.nextDouble());

        System.out.println("Seu novo saldo é:");
        conta.retornarSaldo();


    }
}