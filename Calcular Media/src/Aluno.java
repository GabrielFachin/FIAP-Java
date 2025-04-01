public class Aluno {

    String nome;

    double notaCp;

    double notaGs;

    double notaCh;

    void calcularMediaCp(double notaCp1, double notaCp2, double notaCp3){

        double mediaCp = (notaCp1 + notaCp2 + notaCp3) / 3;

        notaCp = mediaCp * 0.2;


    }

}
