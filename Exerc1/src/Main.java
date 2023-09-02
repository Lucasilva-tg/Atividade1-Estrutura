import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] vet = new int[50];
        Random rand = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(100);
        }

        System.out.println("Vetor Desordenado:");
        System.out.println(Arrays.toString(vet));

        bubbleSort(vet);

        System.out.println("\nVetor Ordenado:");
        System.out.println(Arrays.toString(vet));

        int elementoBuscado = 42;

        int posicaoEncontrada = buscaBinaria(vet, elementoBuscado);

        if (posicaoEncontrada != -1) {
            System.out.println("\nElemento " + elementoBuscado + " encontrado na posição " + posicaoEncontrada);
        } else {
            System.out.println("\nElemento " + elementoBuscado + " não encontrado.");
        }
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                    a\
                }
            }
        } while (trocou);
    }

    public static int buscaBinaria(int[] vetor, int elemento) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (vetor[meio] == elemento) {
                return meio;
            }
            if (vetor[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }
}