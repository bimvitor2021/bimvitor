//Crie um menu para entrar nas questões:
//Escolha os programas dos 7 exercicios anteriores

import javax.swing.JOptionPane;
public class exercicio12 {
public static void main(String[] args) {

String opcao = JOptionPane.showInputDialog(
"Escolha um programa:\n" +
"1 - Antecessor ou sucessor\n" +
"2 - Soma, Subtração, Multiplicação, Divisão e Potência\n" +
"3 - Dias Vividos\n" +
"4 - Cotação do Dolar\n" +
"5 - Troca de variáveis\n" +
"6 - Números Ímpares ou Pares\n" +
"7 - Números Negativos ou Positivos"   );
int escolha = Integer.parseInt(opcao);
switch (escolha) { case 1:antecessorOuSucessor(); break;
                   case 2:operacoesMatematicas(); break;
                   case 3:diasVividos(); break;
                   case 4:cotacaoDolar(); break;
                   case 5:trocaVariaveis(); break;
                   case 6:parOuImpar();  break;
                   case 7:negativoOuPositivo();  break;
                   default:
                       JOptionPane.showMessageDialog(null, "Opção inválida!"); break;
            }    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void antecessorOuSucessor() {
String input = JOptionPane.showInputDialog("Digite um número inteiro:");
int numero = Integer.parseInt(input);
String escolha = JOptionPane.showInputDialog("Digite 'A' para Antecessor ou 'S' para Sucessor:");
int resultado;
if (escolha.equals("A")) {
   resultado = numero - 1;
} else {
   resultado = numero + 1;
 }
JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void operacoesMatematicas() {
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void diasVividos() {
String minhaIdade = JOptionPane.showInputDialog("Digite a sua idade:");
int idadeAtual = Integer.parseInt(minhaIdade);
int diasVividos = idadeAtual * 365;
    String resultado = "Você já viveu " + diasVividos + " dias.";
JOptionPane.showMessageDialog(null, resultado);
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void cotacaoDolar() {
    double COTACAO = 5.12;
    String valorDigitado = JOptionPane.showInputDialog("Qual seu dinheiro em dólares (US$):");
    if (valorDigitado != null && !valorDigitado.trim().isEmpty()) {

        double valorconvertido = Double.parseDouble(valorDigitado);
        double valorReais = valorconvertido * COTACAO;

JOptionPane.showMessageDialog(null,String.format("US$ %.2f equivale a R$ %.2f", valorconvertido, valorReais), "Seu Dinheiro Convertido", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,"Por favor, digite um número válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);

} else {
JOptionPane.showMessageDialog(null,"Nenhum valor foi inserido.", "Erro", JOptionPane.ERROR_MESSAGE);
} }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void trocaVariaveis() {
    String valorA = JOptionPane.showInputDialog("Digite o valor de A:");
    int A = Integer.parseInt(valorA);
    String valorB = JOptionPane.showInputDialog("Digite o valor de B:");
    int B = Integer.parseInt(valorB);

    JOptionPane.showMessageDialog(null, "Antes da troca:\nA = " + A + "\nB = " + B);

    int aux = A;
    A = B;
    B = aux;

    JOptionPane.showMessageDialog(null, "Depois da troca:\nA = " + A + "\nB = " + B);
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void parOuImpar() {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
} }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void negativoOuPositivo() {
String numerodigitado = JOptionPane.showInputDialog("Digite um número:");

int numero = Integer.parseInt(numerodigitado);
String verificarNum;
if (numero > 0) {
verificarNum = "O número " + numero + " é positivo.";
} else if (numero < 0) {
verificarNum = "O número " + numero + " é negativo.";
} else {
verificarNum = "O número é zero.";
}
JOptionPane.showMessageDialog(null, verificarNum);
        }
}


