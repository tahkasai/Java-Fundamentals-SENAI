import model.SenaiCal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // METODOS EM JAVA
        Scanner scanner = new Scanner(System.in);
        SenaiCal senai = new SenaiCal();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int rest = senai.soma(num1,num2);
        System.out.println("A soma é: "+rest);

        int rest1 = senai.subtracao(50,2);
        System.out.println("A subtração é: "+rest1);

        int rest2 = senai.multiplicacao(num1,num2);
        System.out.println("A multiplicação é: "+rest2);

        int rest3 = senai.divisao(num1,num2);
        System.out.println("A divisão é: "+rest3);
    }
}