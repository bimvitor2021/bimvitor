//Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma
//mensagem informando o tipo do clima, de acordo com as seguintes condições:
//se a temperatura estiver até 18 graus, o clima é frio; se a temperatura estiver
//entre 19 e 23 graus, o clima é agradável; se a temperatura estiver entre 24 e 35
//graus, o clima é quente; se a temperatura estiver acima de 35 graus, o clima é
//muito quente.

import javax.swing.JOptionPane;
public class exercicio15 {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
double temperatura = Double.parseDouble(input);
String mensagem;
   if (temperatura <= 18) {
                    mensagem = "O clima está frio.";
  } else if (temperatura >= 19 && temperatura <= 23) {
                    mensagem = "O clima está agradável.";
  } else if (temperatura >= 24 && temperatura <= 35) {
                    mensagem = "O clima está quente.";
   } else {
                    mensagem = "O clima está muito quente.";
                }
JOptionPane.showMessageDialog(null, mensagem);

JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico.");
            }
        }




