package teste.gupy.target;

import java.util.Scanner;
/**
 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
 * próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde, informado um número,
 * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */
public class QuestOne {
    public static boolean isFibonacciNumber(int n) {
        int a = 0, b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (isFibonacciNumber(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}