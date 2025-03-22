import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Atividade 1: Pré-incremento e Pós-incremento
        int a = 5;
        int b = a++;
        int c = ++a;
        int d = --a;
        int e = a--;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
        System.out.println("Valor de e: " + e);

        System.out.println("---------------------------------------------------");

        // Atividade 3: Operadores Abreviados
        int valor = 20;
        valor = valor + 5;
        valor = valor * 2;
        valor = valor - 3;
        valor = valor / 2;
        valor = valor % 4;
        System.out.println("Resultado final: " + valor);

        System.out.println("---------------------------------------------------");

     
        System.out.println("---------------------------------------------------");

        System.out.println("RESULTADOS");
        System.out.println("---------------------------------------------------");

        // Exercicio 10 - Media de três números
        MediaDeTres media = new MediaDeTres();
        System.out.println("Media de trés números: "+ media.media);

        // Exercicio 9 - Distancia de Long
        DistanciaTerraSol distancia = new DistanciaTerraSol();
        System.out.println("Distancia da Terra e Sol: "+ distancia.distancia + " km.");

        // Exercicio 8 - Unicode
        UnicodeChar letra = new UnicodeChar();
        System.out.println("O valor Unicode de '" + letra.letra + "' é: " + letra.valorUnicode);

        // Exercicio 7 - tipo booleano
        TipoBoolean boleano = new TipoBoolean();
        System.out.println("O número " + boleano.numero + " é maior que 10? " + boleano.maiorQueDez);

        // Exercicio 6 - Usando arrays
        UsandoArrays arrays = new UsandoArrays();
        System.out.println("O primeiro número é: "+arrays.numeros[0]);
        System.out.println("O último número é: "+arrays.numeros[arrays.numeros.length - 1]);

        // Exercicio 5 - Area de um triangulo
        CalcularArea area = new CalcularArea();
        System.out.println("A área do triangulo é: "+area.area);

        // Exercicio 4 - String e dados multivalorados
        Saudacao dados = new Saudacao();
        System.out.println("Meu nome é "+dados.nome+" tenho "+dados.idade+" anos e peso "+dados.peso+" kg.");

        // Exercicio 2 - Soma de números
        SomaNumeros soma = new SomaNumeros();
        System.out.println("A soma é: " + soma.soma);

        // Exercicio 1 - Declarando variaveis
        DeclarandoVariaveis variavel = new DeclarandoVariaveis();
        System.out.println("Sua idade é " + variavel.idade);
        System.out.println("Sua altura é " + variavel.altura);
        System.out.println("A inicial do seu nome é '" + variavel.inicial + "'");
        System.out.println("Você é estudante? " + variavel.estudante);

    }
}