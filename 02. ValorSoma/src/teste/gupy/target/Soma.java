package teste.gupy.target;

public class Soma {

    public static void main(String[] args) {
    int indice = 12;
    int soma = 0;
    int K = 1;

    while (K < indice) {
        K = K + 1;
        soma = soma + K;
        System.out.println(soma);
    }

    System.out.println("O valor da soma é: " + soma);
}
}