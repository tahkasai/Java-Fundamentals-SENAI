import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        String inputSenaiJava = JOptionPane.showInputDialog("??");
        int input = Integer.parseInt(inputSenaiJava);
        input++;
*/ // Entrada de dados por teclado

/*
        String[] senaiValues = {"Aluno1", "Aluno2", "Aluno3"};
        String input2 = (String) JOptionPane.showInputDialog(
                null,

                "Está é a mensagem",
                "Titulo da caixa de dialogo",
                2,
                null,
                senaiValues,
                senaiValues[1]
        );
*/ // Lista de dados usando JOptionPane

/*
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(26);
        double y = scanner.nextDouble();
        String z = scanner.next("Peixe");

        scanner.close();
*/  // Entrada de dados usando Scanner

/*
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Olá "+nome+"!");
*/ // Captura de String

/*
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "O número digitado + 1 é: " + (numero + 1));
*/ // Converão de arquivo

/*        try {
            File arquivo = new File("dados.txt");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
*/ // Usando Scanner para Arquivos

        
    }
}