package map.lab1;

import java.util.Arrays;

//Aufgabe 3: es gibt 2 grosse Zahlen. Die Zahlen sind als Array dargestellt

public class GrossZahl {
    //1. Berechnen Sie die Summe.
    // Die Zahlen haben die gleiche Anzahl an Ziffer.
    public static int[] summe(int[] erste, int[] zweite){
        int[] sum = new int[erste.length+1];                            //bilden eine neue Array fur das Ergebnis der Summe
        int carry = 0;
        for(int i=erste.length - 1; i>=0;i--){                          //die Array vom Ende nach vorne durchgehen
            if(erste[i]+zweite[i]+carry > 9){                           //wenn SUmme von position i + rest ist großer als 9
                sum[i + 1] = (erste[i] + zweite[i] + carry) % 10;       //dann wird das Ergebnis Array 2-te Ziffer der Zahl bekommen
                carry = (erste[i]+zweite[i]+carry) / 10;                //und die erste wird im carry behalten bleiben
            }
           else{                                                         //anderfalls
               sum[i+1] = (erste[i] + zweite[i] + carry);               //wird die Ergebnis Array die Zahl bekommen
               carry = 0;                                               //carry ist 0, weil er benutzt wurde
            }
           if (i ==0 && carry != 0)                        //wenn man an die erste Ziffer der Parametter Array ankommnt, und das rest ist verschieden von 0
               sum[i] = carry;                            //dann wird sie das Wert von carry bekommen
        }
//        if(sum[0] == 0){            //wenn die Lange des Ergenisses kleiner ist //wenn die Ergebnisarray die gleiche Laenge wie die Zahlen hat,
//            int[] temp = new int[sum.length - 1];         //macht man eine neue Array mit eine kleinere Laenge
//            for(int i=0; i < sum.length - 1; i++)         //alles wird durchgefuhrt, damit die Zahl nicht mit 0 beginnt
//                temp[i] = sum[i+1];
//            return temp;
//        }
        return sum;
    }

    //2. Berechnen Sie die Differenz
    // Die Zahlen haben die gleiche Anzahl an Ziffer.
    public static int[] differenz(int[] erste, int[] zweite){
        int[] diff = new int[erste.length];
        int[] subtrahiert = new int[erste.length];

        boolean tauschen = false;
        int k = 0;
        while(!tauschen && k < erste.length){       //bestimmung der kleineren Zahl
            if(erste[0] > zweite[0])
                k = erste.length - 1;
            if(erste[k] < zweite[k])
                tauschen = true;
            k++;
        }
        if(tauschen){                               //wenn zweite ist grosser aks erste = > sie werden getauscht
            diff = zweite;
            subtrahiert = erste;
        }
        else{
            diff = erste;
            subtrahiert = zweite;
        }
        int minus = 0;
        for(int i = diff.length-1; i>=0;i--){       //wir gehen vom ende zum ANfang durch
            if(diff[i] < subtrahiert[i]){           //wenn die Ziffer der 2ten Zahl grosser als die der 1ten Zahl sind
                diff[i] = 10+ diff[i] - subtrahiert[i];
                minus = 1;
            }
            else{
                diff[i] = diff[i] - subtrahiert[i] - minus;
                minus = 0;
            }
        }
        if(diff[0] == 0){                               //falls das Ergebnis eine kleinere Lange hat
            int[] temp = new int[diff.length-1];        //wird eine neue Array mit eine kleinere Laenge gemacht
            for(int i=0; i< diff.length-1; i++)         //alles wird durchgefurht, damit die Zahl nicht mit 0 beginnt
                temp[i] = diff[i+1];
            return temp;
        }
        return diff;
    }
    //3. Berechnen Sie die Multiplikation
    // 1-te Zahl ist array, die zweite ist eine ziffer.
    public static int[] multiplikation(int[] erste, int zweite){
        int[] prod = new int[erste.length+ 1];
        int carry = 0;
        for(int i= erste.length - 1; i>=0; i--){        //vom Ende durchgehen
            if(erste[i] * zweite + carry > 9){
                prod[i+1] = (erste[i] * zweite + carry) %10;        //diese Berechnung ist ahnlich mit der Summe
                carry = (erste[i] * zweite + carry) / 10;
            }
            else{
                prod[i+1] = (erste[i] * zweite + carry);
                carry = 0;
            }
            if( i== 0 && carry !=0)
                prod[i] = carry;
        }
        if(prod[0] == 0){
            int[] temp = new int[prod.length - 1];
            for(int i=0; i< prod.length - 1; i++)
                temp[i] = prod[i+1];
            return temp;
        }
        return prod;
   }

    //Berechnen Sie die ganzzahlige Division.
    // Die erste Zahl ist eine große Zahl, die zweite Zahl ist nur eine Ziffer.
    public static int[] division(int[] erste, int zweite) {
        int[] div = new int[erste.length];
        int rest = 0;
        for (int i = 0; i < erste.length - 1; i++) {
            if (erste[i] < zweite) {
                rest = (erste[i] * 10 + erste[i + 1]) % zweite;
            } else {
                div[i] = erste[i] / zweite;
                rest = erste[i] % zweite;
            }
            if (rest != 0) {
                erste[i + 1] = rest * 10 + erste[i + 1];
                rest = 0;
            }
        }
        return div;
    }
}
