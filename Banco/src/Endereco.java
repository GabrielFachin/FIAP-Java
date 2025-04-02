public class Endereco {

    String logradouro;

    short numero;

    String complemento;

    String cep;

    Endereco endereco;

    String retornarEndereco(){

    String dados = "Logradouro :" + logradouro + "Número: " + numero + "complemento: " + complemento + "cep: " + cep;


        return dados;
    }

}
