//Crie um algoritmo que lê o salário de um funcionário, informe para ele que
//ele receberá um reajuste para o salário novo salario em 7%, mostrar na saída ,
//O nome do Funcionário, O Salario Antigo , e o novo salario após reajuste.

import javax.swing.JOptionPane;
public class exercicio04 {
public static void main(String[] args) {
String funcionario = JOptionPane.showInputDialog("Digite o nome do funcionário:");
String salariovelho = JOptionPane.showInputDialog("Digita o salario Atual do funcionario:");
double salarioAtual = Double.parseDouble(salariovelho);

double novoSalario = salarioAtual * 1.07;

String respostaFinal =  "Nome do Funcionário: " + funcionario + "\n" +
                        "Salário Antigo: R$ " + String.format("%.2f", salarioAtual) + "\n" +
                        "Novo Salário após Reajuste: R$ " + String.format("%.2f", novoSalario);

JOptionPane.showMessageDialog(null, respostaFinal);
        }
    }

