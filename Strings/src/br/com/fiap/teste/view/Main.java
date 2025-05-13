package br.com.fiap.teste.view;

public class Main {

    public static void main(String[] args) {
        String email = "Antonella@lizmacedo.com";
        String confirmacaoEmail = new String("antonella@lizmacedo.com");

        //Validar se os e-mails são iguais
        if (email.equalsIgnoreCase(confirmacaoEmail)){ //Comprar o valor ("texto") do objeto string
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }
        System.out.println(email);
        System.out.println(confirmacaoEmail);

        System.out.printf("email sem dominio: " + email.substring(0,email.indexOf("@")) +" ");
        System.out.println("dominio: " + email.substring(email.indexOf("@") + 1,email.length()));

    }
}
