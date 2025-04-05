import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Seja bem vindo! por favor, diga seu nome: ");
        aluno.nome = scan.nextLine();

        System.out.println("Certo," + aluno.nome + ",Agora nos diga suas 3 notas dos Checkpoints");
        double cp1 = scan.nextDouble();
        double cp2 = scan.nextDouble();
        double cp3 = scan.nextDouble();
        aluno.calcularMediaCp(cp1, cp2, cp3);

        System.out.println("Agora diga-nos sua nota da Global Solution: ");
        aluno.notaGs = scan.nextDouble() * 0.6;

        System.out.println("Por último, nos informe sua nota do Challenge");
        aluno.notaCh = scan.nextDouble() * 0.2;

        double nota = aluno.notaFinal();

        System.out.println(aluno.nome + "Sua nota foi: " + nota);

    }
}