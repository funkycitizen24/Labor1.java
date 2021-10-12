package map.lab1;
//Aufgabe2
import java.util.Arrays;
//Es gibt eine Array mit n positive Zahlen.

public class PositiveZahlen {
    //1. Finden Sie die maximale Zahl
    public static int maximal(int[] Zahlen){
        int max = Zahlen[0];
        for(int i=0; i< Zahlen.length; i++){
            if(Zahlen[i]>max){
                max = Zahlen[i];
            }
        }
        return max;
    }

    //2. Finden Sie die minimale Zahl
    public static int minimal(int[] Zahlen){
        int min = Zahlen[0];
        for(int i=0; i< Zahlen.length; i++){
            if(Zahlen[i]< min){
                min = Zahlen[i];
            }
        }
        return min;
    }

    //3. Finden Sie die maximale Summe von n- 1 Zahlen
    public static int maxSum(int[] Zahlen){
        int sum = 0;
        int[] sortierung = Zahlen;
        Arrays.sort(sortierung);
        for(int i= sortierung.length - 1; i > 0; i--){
            sum = sum+ sortierung[i];
        }
        return sum;
    }

    //4. Finden Sie die minimale Summe von n -1 Zahlen
    public static int minSum(int[] Zahlen){
        int sum = 0;
        int[] sortierung = Zahlen;
        Arrays.sort(sortierung);
        for(int i = 0; i< sortierung.length-1; i++){
            sum = sum + sortierung[i];
        }
        return sum;
    }

    //Extra fur die Anzeige der Array auf dem Bildschirm
    public static void anzeige(int[] Zahlen){
        for(int i=0; i< Zahlen.length; i++){
            System.out.print(Zahlen[i]+ " ");
        }
        System.out.println("");
    }
}
