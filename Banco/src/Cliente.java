public class Cliente {

    String nome;

    String cpf;

    Endereco endereco;


    String retornarDados(){

        String dados = "Nome: " + nome + ", cpf: " + cpf + "endereço: " + endereco.retornarEndereco();

        return dados;
    }
}
