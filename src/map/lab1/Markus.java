package map.lab1;

import java.util.Arrays;
//Aufgabe 4
public class Markus {
    //1. Methode: liefert den Preis der billigsten Tastatur

    public int billigste(int [] Tastatur){
        return PositiveZahlen.minimal(Tastatur);
    }

    //2. Methode: liefert den teueresten Gegenstand
    public int teuersten(int [] Tastatur, int[] USB){
        int maxTast = PositiveZahlen.maximal(Tastatur);
        int maxUSB = PositiveZahlen.maximal(USB);
        if(maxTast > maxUSB)
            return maxTast;
        else
            return maxUSB;
    }

    //3. Methode: gibt der teuerste USB der Markus kaufen kann zuruck
    public int teuersteUSB(int[] USB, int Geld){
        int maxPreisUSB = 0;
        for(int i=0; i< USB.length; i++){
            if(maxPreisUSB < USB[i] && Geld >= USB[i])
                maxPreisUSB = USB[i];
        }
        return maxPreisUSB;
    }

    //4. Methode: liefert den maximalen Geldbetrag, den Markus ausgeben kann
    public int Geldbetrag(int[] Tastatur, int[] USB, int Geld){
        int[] sortTastatur = Tastatur;
        Arrays.sort(sortTastatur);          //es werden 2 Kopien gemacht
        int[] sortUSB = USB;
        Arrays.sort(sortUSB);
        if(Geld < sortTastatur[0] + sortUSB[0])     //wenn das Geldbetrag nicht genuegt
            return -1;
        int i = sortTastatur.length- 1;
        int j = sortUSB.length -1;
        while(i>=0 && j>=0){            //solange es gibt Elemente in beiden Arrays
            if(sortTastatur[i] + sortUSB[j] <= Geld)        //wenn die teuersten Gerate im Geldbetrag sind, die SUche ist beendet
                return sortTastatur[i] + sortUSB[j];
            else                                            //anders
                if(sortTastatur[i] < sortUSB[j])           //das billigste Gerat wird geandert mit einem billigeren
                    if(i != 0)                             //wenn es keine andere Tastatur gibt, man nimmt ein anderes USB
                        i = i-1;
                    else
                        j = j-1;
                    else                                   //und umgekehrt
                        if(j != 0)
                            j = j-1;
                        else
                            i = i-1;
        }
        return sortTastatur[i] + sortUSB[j];
    }
}
