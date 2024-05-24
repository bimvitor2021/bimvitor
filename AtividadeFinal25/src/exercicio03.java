//Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias
//essa pessoa já viveu, Baseando que o ano tem sempre 365 dias.

import javax.swing.JOptionPane;

public class exercicio03 {
public static void main(String[] args) {
String minhaIdade = JOptionPane.showInputDialog("Digite a sua idade:");
int idadeAtual = Integer.parseInt(minhaIdade);
int diasVividos = idadeAtual * 365;
String resultado = "Você já viveu " + diasVividos + " dias.";

JOptionPane.showMessageDialog(null, resultado);
        }
    }

