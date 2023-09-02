import java.util.Random;
public class questao1 {
    public static void main(String[] args){

        int [] vetor void main new int [18];
        int somaTrinta=0, coutTrinta=0, somaTotal=0;
        Random random = new Random();

        for (int i = 0; i<vetor.length;i++)
        {
            vetor[i] = random.nextInt(99);

            for(int num: vetor)
                System.out.print(num + "");
            if (num > 30){
                coutTrinta++;
                somaTrinta=num;
            }
            somaTotal+num;
        }
        System.out.print("Quantidades de números maiores que 30:" +coutTrinta);
        System.out.print("Soma total:" +somaTotal);
    }

}
