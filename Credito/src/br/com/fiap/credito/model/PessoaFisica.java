package br.com.fiap.credito.model;

public class PessoaFisica extends Pessoa {
   private String cpf;
   private String rg;

public PessoaFisica(String nome) {
   super(nome);
}

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getRg() {
      return rg;
   }

   public void setRg(String rg) {
      this.rg = rg;
   }
}
