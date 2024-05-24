import javax.swing.JOptionPane;
public class exercicio23 {

        public static void main(String[] args) {
            int contadorMaioresQueOito = 0;

            for (int i = 1; i <= 15; i++) {
                String input = JOptionPane.showInputDialog("Digite o número " + i + ":");
                double numero = Double.parseDouble(input);
                if (numero > 8) {
                    contadorMaioresQueOito++;
                }
            }

            JOptionPane.showMessageDialog(null, "Quantidade de números maiores que 8: " + contadorMaioresQueOito);
        }
    }
