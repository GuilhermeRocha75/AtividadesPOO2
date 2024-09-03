
package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

 String numeroCartao;
 
 //getter e setters

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
 

    public void mascararCartao() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        numeroCartao = ler.nextLine();
        
        String mascarado = "************" + numeroCartao.substring(numeroCartao.length() - 4);
        
        System.out.println("Número do cartão: " + mascarado);
    }

    public static void main(String[] args) {
        Exercicio8 exercicio = new Exercicio8();
        exercicio.mascararCartao();
    }
}
