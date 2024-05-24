//Crie um algoritmo que lê um valor real em dólar, e converte o valor para
//reais. Considere que a cotação é US$ 1 = R$ 5,12 centavos.

import javax.swing.JOptionPane;
public class exercicio06 {

public static void main(String[] args) {
    double COTACAO = 5.12;
String valorDigitado = JOptionPane.showInputDialog("Qual seu dinheiro em dólares (US$):");

if (valorDigitado != null && !valorDigitado.trim().isEmpty()) {
try {
double valorconvertido = Double.parseDouble(valorDigitado);
double valorReais = valorconvertido * COTACAO;

JOptionPane.showMessageDialog(null,String.format("US$ %.2f equivale a R$ %.2f", valorconvertido, valorReais), "Seu Dinheiro Convertido", JOptionPane.INFORMATION_MESSAGE);
} catch (NumberFormatException e) {

JOptionPane.showMessageDialog(null,"Por favor, digite um número válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                }
} else {

JOptionPane.showMessageDialog(null,"Nenhum valor foi inserido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

