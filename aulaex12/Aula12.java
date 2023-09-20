
package aulaex12;

import java.util.Scanner;


public class Aula12 {
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite a sua idade");
    int idade = ler.nextInt();
    if (idade<18) {
        System.out.println("Menor de idade!");
    }else { System.out.println("Maior de idade");
            }   
                
    }
}
