import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//     Manipulação de caracteres

//     System.out.println("Digite três caracteres:");
//     char char1 = scanner.next().charAt(0); // Lê o primeiro caractere
//     char char2 = scanner.next().charAt(0); // Lê o segundo caractere
//     char char3 = scanner.next().charAt(0); // Lê o terceiro caractere
//
//     System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3);
//     scanner.close();

        // Concatenação de Strings e números
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do item:");
        double preco = scanner.nextDouble();

        System.out.println("Digite o imposto sobre o item (em %):");
        double imposto = scanner.nextDouble() / 100;

        System.out.println("Digite a quantidade do item:");
        int quantidade = scanner.nextInt();

        double precoTotal = quantidade * preco * (1 + imposto);
        System.out.printf("Você comprou %d itens. O preço total com imposto é: R$%.2f%n", quantidade, precoTotal);
        scanner.close();
    }

    // ----------------------------------------------------------------------
    // CONVERÇÃO DE DADOS
    // ----------------------------------------------------------------------
    public  static void ConversaoDeDados (String[] args){

        // Promoção Automática
        int numeroInt = 10;
        double numeroDouble = numeroInt;
        System.out.println(numeroDouble);
        System.out.println();

        // Casting Explícito
        double numDouble = 123.456;
        int numInt = (int) numDouble;
        System.out.println(numInt);
        System.out.println();

        // Parsing de Strings
        String numTexto = "42";
        int numeInt = Integer.parseInt(numTexto);
    }
    // ----------------------------------------------------------------------
    // Atividade 4 de conversão de dados
    // ----------------------------------------------------------------------
    public static void ParsingStrings(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String inputInt = scanner.nextLine();

        try {
            int numerInt = Integer.parseInt(inputInt);
            System.out.println("Número inteiro convertido: " + numerInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para inteiro: " + e.getMessage());
        }

        System.out.print("Digite um número decimal: ");
        String inputDouble = scanner.nextLine();

        try {
            double numeroDouble = Double.parseDouble(inputDouble);
            System.out.println("Número decimal convertido: " + numeroDouble);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para decimal: " + e.getMessage());
        }
    }
}