//Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando
//o dia da semana e informe o nome do dia correspondente.

import javax.swing.JOptionPane;
public class exercicio17 {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
int numeroDia = Integer.parseInt(input);
 String nomeDia;
 switch (numeroDia) {
     case 1: nomeDia = "Domingo"; break;
     case 2: nomeDia = "Segunda-feira"; break;
     case 3: nomeDia = "Terça-feira";  break;
     case 4: nomeDia = "Quarta-feira"; break;
     case 5: nomeDia = "Quinta-feira"; break;
     case 6: nomeDia = "Sexta-feira";  break;
     case 7: nomeDia = "Sábado";       break;
     default:
 nomeDia = "Número inválido. Insira um valor entre 1 e 7.";
                }
 JOptionPane.showMessageDialog(null, nomeDia);
 JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro.");
            }
        }


