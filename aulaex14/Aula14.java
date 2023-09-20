
package aulaex14;

import java.util.Scanner;


public class Aula14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int escolha;
        do{ 
            System.out.println("MENU");
            System.out.println("1- Hamburguer");
            System.out.println("2- Cheeseburguer");
            System.out.println("3- Fritas");
            System.out.println("4- Refrigerante");
            System.out.println("5- Milkshake");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opcao");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 0 :
                    System.out.println("Saindo...");
                    break;           
                case 1 :
                    System.out.println("1- Hamburguer- R$30,00");
                    break;
                case 2 :
                    System.out.println("2- Cheeseburguer- R$35,50");
                    break;
                case 3 :
                    System.out.println("3- Fritas- R$20,50");
                    break;
                case 4 :
                    System.out.println("4- Refrigerante- R$10,00");
                    break;
                case 5 :
                    System.out.println("5- Milkshake- R$30,00");
                    break;
                default :
                    System.out.println("Opcao invalida! Tente novamente!");
            }
                    System.out.println();
                    
        }while(escolha!=0); 
        
            
        
                
    }
}
