package br.com.fiap.data.model;

public class Data {

    private int dia;
    private int mes;
    private int ano;


    public void validarDia(int dia){
        if (dia > 31 || dia <0) {
        this.dia = 1;
            System.out.println("Data invalida, ajustado para '1'");
        }



    }

    public void validarMes(int mes){
        if (mes > 12 || mes < 0){
            this.mes = 1;
            System.out.println("Mês invalido, ajustado para '1'");
        }


    }

    public void validarAno(int ano){
        if (ano < 0){
            this.ano = 2023;
            System.out.println("Ano invalido, ajustado para '2023'");
        }


    }

    public String nomeMes(int mes){
        String nome;
        nome = null;

        if ( mes == 1 ){
            nome = "Janeiro";
        }

        if ( mes == 2 ){
            nome = "Fevereiro";
        }

        if ( mes == 3 ){
            nome = "Março";
        }

        if ( mes == 4 ){
            nome = "Abril";
        }

        if ( mes == 5 ){
            nome = "Maio";

        }

        if ( mes == 6 ){
            nome = "Junho";

        }

        if ( mes == 7 ){
            nome = "Julho";

        }

        if ( mes == 8 ){
            nome = "Agosto";

        }

        if ( mes == 9 ){
            nome = "Setembro";

        }

        if ( mes == 10 ){
            nome = "Outubro";

        }

        if ( mes == 11 ){
            nome = "Novembro";

        }

        if ( mes == 12 ){
            nome = "Dezembro";

        }
        return nome;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }




    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;


    }

    public String getData(){
        return dia + "/" + mes + "/" + ano;
    }
}
