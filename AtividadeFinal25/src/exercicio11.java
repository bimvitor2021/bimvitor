//Crie um algoritmo que leia um número do usuário e informe se e o número
//é par ou ímpar .

import javax.swing.JOptionPane;
public class exercicio11 {
public static void main(String[] args) {

    String input = JOptionPane.showInputDialog("Digite um número:");
    int numero = Integer.parseInt(input);
    String mensagem;

if (numero % 2 == 0) {
                mensagem = "O número " + numero + " é par.";
} else {
                mensagem = "O número " + numero + " é ímpar.";
            }
JOptionPane.showMessageDialog(null, mensagem);
        }
    }
