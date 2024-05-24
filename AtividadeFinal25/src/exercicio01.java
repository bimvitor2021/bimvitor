//Crie um algoritmo que leia um número inteiro e pergunte o ao usuário qual o numero ele quer que imprima na tela o Antecessor ou sucessor.

import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite um número inteiro:");

       int numero = Integer.parseInt(input);

       String escolha = JOptionPane.showInputDialog("Digite 'A' para Antecessor ou 'S' para Sucessor:");

       int resultado;
        if (escolha.equals("A")) {
            resultado = numero - 1;
        } else {
            resultado = numero + 1;
        }

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}