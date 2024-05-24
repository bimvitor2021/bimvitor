//Escreva um algoritmo que leia 15 números do usuário e exiba quantos
//números são pares.

import javax.swing.JOptionPane;
public class exercicio24 {
public static void main(String[] args) {
int contePares = 0;
    for (int i = 1; i <= 15; i++) {
    String input = JOptionPane.showInputDialog("Digite o número " + i + ":");
    double numero = Double.parseDouble(input);
    if (numero % 2 == 0) {
 contePares++;
                }
            }
 JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + contePares);
        }
    }