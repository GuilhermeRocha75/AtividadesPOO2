
package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

 String email;
//getter e setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
 
 
 
    public void extrairDominio() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o seu email: ");
        email = ler.nextLine();
        
        String dominio = email.substring(email.indexOf("@") + 1);
        
        System.out.println("Domínio: " + dominio);
    }

    public static void main(String[] args) {
        Exercicio7 e7 = new Exercicio7();
        e7.extrairDominio();
    }
}