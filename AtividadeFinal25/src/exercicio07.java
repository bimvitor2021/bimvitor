//Crie um algoritmo que leia as variáveis inteiras A e B e troque o valor destas
//variáveis. Isto é, A deve ficar com o valor de B, e B deve ficar com o valor de A.
//Mostre os valores de A e B - Antes e depois da troca. (dica usar uma variável
//auxiliar)

import javax.swing.JOptionPane;
public class exercicio07 {

public static void main(String[] args) {

String valorA = JOptionPane.showInputDialog("Digite o valor de A:");
    int A = Integer.parseInt(valorA);
String valorB = JOptionPane.showInputDialog("Digite o valor de B:");
    int B = Integer.parseInt(valorB);

JOptionPane.showMessageDialog(null, "Antes da troca:\nA = " + A + "\nB = " + B);

int aux = A;
    A = B;
    B = aux;

JOptionPane.showMessageDialog(null, "Depois da troca:\nA = " + A + "\nB = " + B);

 }
    }