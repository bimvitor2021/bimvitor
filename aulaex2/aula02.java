package aulaex2;

/**
 * Exercício 02
 * Aula:10/07/2023
 * Disciplina: Linguagem de Programação
 * Materia: Manipulação de String
 * Documentação 1:https://www.w3schools.com/java/java_variables.asp
 * Documentação 2: https://www.w3schools.com/java/java_strings.asp
 * @author Deivid Sardinha
 * A concatenação de strings é o processo de combinar duas 
 * ou mais strings. Em Java, você pode usar o operador de 
 * adição (+) ou o método concat() para realizar essa operação. Por exemplo:
 * 
 */
public class aula02 {
    public static void main(String[] args) {
        //Concatenação de Strings
        String saudacao = "Olá";
        String nome = "Maria";
        String mensagem = saudacao + ", " + nome + "!";
        
        System.out.println(mensagem);
        
        //Tamanho de uma String
        String texto = "Hello, World!";
        int tamanho = texto.length(); 
        
        System.out.println(tamanho);
        
        //Transformação de uma String em letras Maiusculas e Minusculas
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   
        System.out.println(txt.toLowerCase());   
    }
}
