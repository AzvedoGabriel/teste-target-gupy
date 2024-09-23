package teste.gupy.target;

import java.util.Scanner;
/**
 * 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
 * seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
 */
public class QuestTwo {
    public static int contarLetraA(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String string = scanner.nextLine();

        int qtd = contarLetraA(string);
        if (qtd > 0) {
            System.out.println("A letra 'a' aparece " + qtd + " vez(es).");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
}
