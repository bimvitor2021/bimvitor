//Construa um algoritmo que leia do usuário o salário e exiba uma
//mensagem de acordo com as seguintes condições: se o salário for até R$
//1442,00, escreva a mensagem “Até 1 salário mínimo; se o salário for acima de
//R$ 2884,00 e até R$ 4320,00 escreva a mensagem “Até 3 salários mínimos”;
//se for acima de R$ 4320,00, escreva a mensagem “Já é um profissional de TI”.


import javax.swing.JOptionPane;
public class exercicio16 {

public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Digite o salário (em reais):");

double salario = Double.parseDouble(input);
String mensagem;
if (salario <= 1442.00) {
                    mensagem = "Até 1 salário mínimo.";
} else if (salario >= 2884.00 && salario <= 4320.00) {
                    mensagem = "Até 3 salários mínimos.";
} else {
                    mensagem = "Já é um profissional de TI.";
                }
JOptionPane.showMessageDialog(null, mensagem);
JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico.");
            }
        }
