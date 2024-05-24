import javax.swing.JOptionPane;
public class exercicio14 {
public static void main(String[] args) {

String input = JOptionPane.showInputDialog("Digite um número:");

int numero = Integer.parseInt(input);
if (numero % 5 == 0) {
JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de 5.");
} else {
JOptionPane.showMessageDialog(null, "O número " + numero + " não é múltiplo de 5.");
  }
         }
    }