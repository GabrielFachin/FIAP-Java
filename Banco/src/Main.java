import java.util.Scanner;

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Cliente cliente = new Cliente();
    ContaCorrente conta = new ContaCorrente();
    Endereco endereco = new Endereco();

    System.out.println("Olá! por favor, digite seu nome!");
    cliente.nome = scan.nextLine();

    System.out.println("Certo," + cliente.nome + "Agora informe seu CPF: ");
    cliente.cpf = scan.nextLine();



}