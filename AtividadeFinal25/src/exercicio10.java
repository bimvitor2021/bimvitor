//Crie um algoritmo que leia 3 valores e informe qual o maior número e qual
//o menor número . Caso exista algum igual , informe a igualdade.

import javax.swing.JOptionPane;
public class exercicio10 {
public static void main(String[] args) {

String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
String valor3 = JOptionPane.showInputDialog("Digite o terceiro valor:");

int num1 = Integer.parseInt(valor1);
int num2 = Integer.parseInt(valor2);
int num3 = Integer.parseInt(valor3);

int maior = num1; int menor = num1;

if (num2 > maior) {
                maior = num2;
            }
if (num3 > maior) {
                maior = num3;
            }
if (num2 < menor) {
                menor = num2;
            }
if (num3 < menor) {
                menor = num3;
            }
String igualdade = "";
if (num1 == num2 || num1 == num3 || num2 == num3) {
                igualdade = "Existem números iguais.\n";
            }
String mensagem = igualdade + "O maior número é: " + maior + "\nO menor número é: " + menor;

JOptionPane.showMessageDialog(null, mensagem);
        }
    }


