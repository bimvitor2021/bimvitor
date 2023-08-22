/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula13;

import java.util.Scanner;

public class aula13 {

   public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
int numero, resto;

System.out.println("Digite um numero inteiro:");
numero = ler.nextInt();

resto = numero %2;

if (resto !=0){
    System.out.println("O numero´Impar ");
}else{
System.out.println("O numero´par ");
}
}
  
    
}
    
    
    
    
}
