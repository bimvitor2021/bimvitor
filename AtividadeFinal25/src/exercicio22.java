//Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a
//média dos 15 números. Utilize o comando de repetição (For).


import javax.swing.JOptionPane;
public class exercicio22 {
 public static void main(String[] args) {
            double soma = 0;
 for (int i = 1; i <= 15; i++) {
  String nume = JOptionPane.showInputDialog("Digite o número " + i + ":");
  double numero = Double.parseDouble(nume);
                soma += numero;
            }
  double media = soma / 15;
            JOptionPane.showMessageDialog(null, "A média dos 15 números é: " + media);
        }
    }




