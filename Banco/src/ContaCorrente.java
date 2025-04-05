public class ContaCorrente {

    double saldo = 0;

    Cliente titular;

    void depositar(double valor){

        saldo += valor;

    }


    void retirar(double valor){

        saldo -= valor;

    }

    double retornarSaldo(){


        return saldo;
    }

}
