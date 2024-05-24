//Escreva um algoritmo que pergunte o nome e que leia uma letra que
//represente o sexo de uma pessoa (M para Masculino e F para feminino). Se for
//masculino, mostra a mensagem “Seja bem-vindo, Senhor Fulano de Tal!”, se
//for feminino, mostra a mensagem “Seja bem-vinda, Senhora Fulana de Tal!”.

import javax.swing.JOptionPane;
public class exercicio13 {
public static void main(String[] args) {
String nome = JOptionPane.showInputDialog("Digite o seu nome:");
String sexo = JOptionPane.showInputDialog("Digite o seu sexo (M para Masculino, F para Feminino):").toUpperCase();
switch (sexo) {
    case "M": JOptionPane.showMessageDialog(null, "Seja bem-vindo, Senhor " + nome + "!");
    break;
    case "F": JOptionPane.showMessageDialog(null, "Seja bem-vinda, Senhora " + nome + "!");
    break;
    default:
JOptionPane.showMessageDialog(null, "Sexo inválido! Por favor, digite 'M' para Masculino ou 'F' para Feminino.");
    break;
                }
            }
        }

