public class Aluno {

    String nome;
    double notaCp;
    double notaGs;
    double notaCh;

    void calcularMediaCp(double notaCp1, double notaCp2, double notaCp3){

        notaCp = ((notaCp1 + notaCp2 + notaCp3) / 3) * 0.2;
    }

    double notaFinal(){

        return notaCp + notaGs + notaCh;
    }

}
