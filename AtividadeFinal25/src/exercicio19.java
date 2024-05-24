//Escreva um algoritmo que exiba 20 vezes a mensagem “Eu Odeio estudar
//Java! Utilizei o comando Do While”.
//Utilize o comando de repetição (Do...While).
// Ho prof leo literalmente comando de repetição ok...kkkkkkkk

import javax.swing.JOptionPane;

public class exercicio19 {
    public static void main(String[] args) {
        int contador = 0;

        do {
            JOptionPane.showMessageDialog(null, "Eu Odeio estudar Java!", "Clique 20 vezeses ok...", JOptionPane.INFORMATION_MESSAGE);
            contador++;
        } while (contador < 20);
    }
}

