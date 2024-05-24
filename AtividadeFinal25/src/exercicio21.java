//Faça um programa Utilizando o Switch case , escolhendo os exercícios 18
//,19 e 20. Da seguinte maneira:

import javax.swing.JOptionPane;
public class exercicio21 {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Escolha a entrada da estrutura:\n1 - While\n2 - Do While\n3 - For");
int escolha = Integer.parseInt(input);
switch (escolha) {
    case 1:
                        int contadorWhile = 1;
                        while (contadorWhile <= 10) {
                            System.out.println("Exercício 18 - Iteração " + contadorWhile);
                            // Coloque aqui o código do exercício 18
                            contadorWhile++;
                        }
                        break;
    case 2:
                        int contadorDoWhile = 1;
                        do {
                            System.out.println("Exercício 19 - Iteração " + contadorDoWhile);

                            contadorDoWhile++;
                        } while (contadorDoWhile <= 10);
                        break;
    case 3:
                        for (int i = 1; i <= 10; i++) {
                            System.out.println("Exercício 20 - Iteração " + i);
                            // Coloque aqui o código do exercício 20
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Escolha 1, 2 ou 3.");
                }

                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro.");
            }
        }

