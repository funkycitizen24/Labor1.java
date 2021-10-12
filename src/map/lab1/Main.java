package map.lab1;//Aufgabe1-Bewertungssystem für Studenten

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1. AUFGABE
        System.out.println("1. AUFGABE:");
        Uni universitat = new Uni();

        int[] Noten = {41, 67, 84, 100, 94, 58, 77};
        System.out.print("Die Noten der Studenten: ");
        for (int i = 0; i < Noten.length; i++) {
            System.out.print(Noten[i] + " ");
        }
        System.out.println(" ");

        int[] Failed = universitat.kleineNoten(Noten);
        System.out.print("Nicht ausreichende Noten: ");
        for (int i = 0; i < Failed.length; i++) {
            if (Failed[i] != 0) {
                System.out.print(Failed[i] + " ");
            }
        }
        System.out.println(" ");

        System.out.println("Durchschnitt = " + universitat.Durchschnitt(Noten));

        int[] abgerundet = universitat.Abrundung(Noten);
        System.out.print("Die Abgerundete noten: ");
        for (int i = 0; i < abgerundet.length; i++) {
            System.out.print(abgerundet[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Die maximale Rundnote: ");
        System.out.println(universitat.MaxNote(Noten));
        System.out.println(" ");



        //2. AUFGABE
        System.out.println("2. AUFGABE:");
        PositiveZahlen array = new PositiveZahlen();
        int n =6;
        int[] Zahlen = {13,45,81,2,3,19,2};
        System.out.println("Die Zahlenarray: ");
        array.anzeige(Zahlen);
        System.out.println("Maximale Zahl: " + array.maximal(Zahlen));
        System.out.println("Minimale Zahl: " + array.minimal(Zahlen));
        System.out.println("Maximale Summe der n-1 Zahlen: " + array.maxSum(Zahlen));
        System.out.println("Minimale Summe der n-1 Zahlen:" + array.minSum(Zahlen));
        System.out.println(" ");


        //3.AUFGABE
        System.out.println("3. AUFGABE:");
        GrossZahl grossZahl = new GrossZahl();
        int[] erste = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zweite = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] resultat = grossZahl.summe(erste, zweite);
        System.out.print("Summe = ");
        for(int i=0; i< resultat.length; i++)
            System.out.print(resultat[i]);
        System.out.println(" ");

        int[] dritte = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] vierte = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] diff = grossZahl.differenz(dritte, vierte);
        System.out.print("Differenz = ");
        for(int i=0; i< diff.length; i++)
            System.out.print(diff[i]);
        System.out.println(" ");

        int[] funfte = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] produkt = grossZahl.multiplikation(funfte, 4);
        System.out.print("Produkt = ");
        for(int i=0; i< produkt.length; i++)
            System.out.print(produkt[i]);
        System.out.println(" ");

        int[] sieben = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int acht = 2;
        int[] quotient = grossZahl.division(sieben, acht);
        System.out.print("Division = ");
        for(int i=0; i<quotient.length; i++)
            System.out.print(quotient[i]);
        System.out.println(" ");
        System.out.println(" ");


        //4. AUFGABE
        System.out.println("4. AUFGABE:");
        Markus kauf = new Markus();
        int[] tastatur = {40, 35, 70, 15, 45};
        System.out.print("Die billigste Tastatur: " + kauf.billigste(tastatur));
        int[] tastatur2 = {15, 20, 10, 35};
        int[] USB = {20, 15, 40, 15};
        System.out.println(" ");
        System.out.println("Das teuerste Gerat: " +kauf.teuersten(tastatur2, USB));
        int[] preise = {15, 45, 20};
        int geld = 30;
        System.out.println("Das teuerste USB fur Markus: " + kauf.teuersteUSB(preise, geld));

        int[] tastaturen= {40, 50, 60};
        int[] USB2 = {15,12};
        int geld2 = 51;
        System.out.println("Markus kann am meisten " + kauf.Geldbetrag(tastaturen, USB2, geld2) + " Euro ausgeben.");
    }
}