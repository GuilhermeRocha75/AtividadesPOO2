/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    
    String nome;
    
     Scanner ler = new Scanner(System.in);//scanner

     
     //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public void lerNome(){
        System.out.println("Qual o seu nome?");
        nome = ler.nextLine();
}
    
    public void exibirInfo() {
        System.out.println("Olá, "+ nome+ "! Bem vindo ao programa");
    }
    
    public static void main(String[] args) {
       Exercicio2 r1 = new Exercicio2();
       
        r1.lerNome();
        r1.exibirInfo();
    }
    
}
