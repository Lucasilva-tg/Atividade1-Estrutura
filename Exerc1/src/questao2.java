import java.util.Random;

public class questao2 {
    public static void main(String[] args) {

        int[] vet = new int[10];

        Random rand = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(100);
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        int elementoBuscado = 42;


        boolean encontrado = false;
        int posicaoEncontrada = -1;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == elementoBuscado) {
                encontrado = true;
                posicaoEncontrada = i;
                break;
            }
        }


        if (encontrado) {
            System.out.println("Elemento " + elementoBuscado + " encontrado na posição " + posicaoEncontrada);
        } else {
            System.out.println("Elemento " + elementoBuscado + " não encontrado.");
        }
    }
}