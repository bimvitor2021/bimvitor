//Crie um algoritmo que lê dois números inteiros, A e B, e mostre o resultado
//da soma, subtração, multiplicação, multiplicação , divisão , Potencia e o Mode
//% de A por B;

import javax.swing.JOptionPane;

public class exercicio02 {
public static void main(String[] args) {

String inputA = JOptionPane.showInputDialog("Digite o número (A):");
int A = Integer.parseInt(inputA);

String inputB = JOptionPane.showInputDialog("Digite o número (B):");
int B = Integer.parseInt(inputB);

int soma = A + B;
int subtracao = A - B;
int multiplicacao = A * B;
double divisao = (double) A / B;
double potencia = Math.pow(A, B);
int modulo = A % B;

String mensagem = "Resultados:\n" +
                "Soma: " + A + " + " + B + " = " + soma + "\n" +
                "Subtração: " + A + " - " + B + " = " + subtracao + "\n" +
                "Multiplicação: " + A + " * " + B + " = " + multiplicacao + "\n" +
                "Divisão: " + A + " / " + B + " = " + divisao + "\n" +
                "Potência: " + A + " ^ " + B + " = " + potencia + "\n" +
                "Módulo: " + A + " % " + B + " = " + modulo;

JOptionPane.showMessageDialog(null, mensagem);
    }
}













