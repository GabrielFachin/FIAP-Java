package br.com.fiap.credito.view;

import br.com.fiap.credito.model.Endereco;
import br.com.fiap.credito.model.PessoaFisica;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Luiz");

        pf.setNome("teste");
        pf.setCpf("123456789");
        pf.setRg("123456789");
        pf.setIdade(20);

        Endereco endereco = new Endereco();

        endereco.setRua("Av Paulista");
        endereco.setNumero("200");
        pf.setEndereco(endereco);



    }
}
