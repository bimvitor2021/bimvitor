//Crie um algoritmo que leia um número do usuário e informe se e o número é
//positivo ou negativo.

import javax.swing.JOptionPane;

public class exercicio08 {
public static void main (String[]args) {

String numerodigitado = JOptionPane.showInputDialog("Digite um número:");

int numero = Integer.parseInt(numerodigitado);
String verificarNum;
if (numero > 0) {
verificarNum = "O número " + numero + " é positivo.";
} else if (numero < 0) {
verificarNum = "O número " + numero + " é negativo.";
} else {
verificarNum = "O número é zero.";
            }
JOptionPane.showMessageDialog(null, verificarNum);
        }
    }
