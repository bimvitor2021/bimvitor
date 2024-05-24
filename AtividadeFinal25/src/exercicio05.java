//Crie um algoritmo que lê o salário de um funcionário, pergunte a ele qual a
//porcentagem ele quer ter de aumento, (o Aumento so poderá ser até 13%)
//caso seja maior que 13%, o programa devera emitir uma saída informando que
//a porcentagem é invalida, a mesda deverá ser menor ou igual a 13%. Informe
//para ele que ele receberá um reajuste para o salário novo salario em X %,
//mostrar na saída: O nome do Funcionário, O Salario Antigo, e o novo salario
//após reajuste de X%;

import javax.swing.JOptionPane;

public class exercicio05 {
public static void main(String[] args) {
    String nomeFuncionario = JOptionPane.showInputDialog("Digite o nome do funcionário:");
    String inputSalario = JOptionPane.showInputDialog("Digite o salário atual do funcionário:");
double salarioAntigo = Double.parseDouble(inputSalario);
    String inputPorcentagem = JOptionPane.showInputDialog("Digite a porcentagem de aumento desejada (até 13%):");
double porcentagemAumento = Double.parseDouble(inputPorcentagem);
if (porcentagemAumento > 13) {
    JOptionPane.showMessageDialog(null, "Porcentagem inválida. Deve ser menor ou igual a 13%.");
} else {
double novoSalario = salarioAntigo * (1 + porcentagemAumento / 100);
    JOptionPane.showMessageDialog(null, "Nome do Funcionário: " + nomeFuncionario +
            "\nSalário Antigo: R$ " + salarioAntigo +
            "\nNovo Salário após reajuste de " + porcentagemAumento + "%: R$ " + novoSalario);
            }
        }
    }