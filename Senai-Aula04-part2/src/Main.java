import model.Calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // METODOS EM JAVA
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = scanner.nextInt();
        System.out.printf("Escolha uma operação: %n 1-Soma %n 2-Subtração %n 3-Multiplicação %n 4-Divisão %n");
        int operacao = scanner.nextInt();

        switch (operacao){
            case 1:
                int rest = calculadora.soma(num1,num2);
                System.out.println("A soma é: "+rest);
                break;
            case 2:
                int rest1 = calculadora.subtracao(50,2);
                System.out.println("A subtração é: "+rest1);
                break;
            case 3:
                int rest2 = calculadora.multiplicacao(num1,num2);
                System.out.println("A multiplicação é: "+rest2);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Não existe divisão com zerao!");
                }else{
                    int rest3 = calculadora.divisao(num1,num2);
                    System.out.println("A divisão é: "+rest3);
                    break;
                }
            default:
                System.out.println("Opção incorreta");
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Conversor de Temperatura");
        System.out.println("--------------------------------------------------------------------");

    }
}