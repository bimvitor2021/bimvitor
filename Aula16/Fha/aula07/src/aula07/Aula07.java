/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import java.util.Scanner;


/**
 *Linguagem de programação
 * data 15/08/2023
 * Materia : Entrada
 * @author 91944945687
 */
public class Aula07 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.println("Qual nome do Aluno?");
       String nome = ler.next();
       
       System.out.println("qual a primeira nota?");
       float nota1 = ler.nextFloat();
       System.out.println("qual a seguda nota?");
       float nota2 = ler.nextFloat();
       System.out.println("qual a terceira nota?");
       float nota3 = ler.nextFloat();
        System.out.println("qual a Quarta nota?");
       float nota4 = ler.nextFloat();
       float soma = nota1 + nota2 + nota3 + nota4;
       float media = soma /4;
       System.out.print("A media" + media);
    }
    
}
