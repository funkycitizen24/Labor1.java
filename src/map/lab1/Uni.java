package map.lab1;
//Aufgabe1
public class Uni {
    //1.Methode => gibt die nicht ausreichende Noten zuruck
    public static int[] kleineNoten(int[] Noten){
        int [] Failed = new int[Noten.length];  //neue Array, die mit der nicht ausreichenden Noten gefullt wird
        int k = 0;
        for(int i=0; i<Noten.length; i++){
            if (Noten[i] < 40){
                Failed[k] = Noten [i];
                k++;
            }
        }
        return Failed;
    }

    //2.Methode => gibt der Durchnittsnote zuruck
    public static float Durchschnitt(int[] Noten){
        int sum = 0;
        for(int i=0; i<Noten.length; i++){
            sum = sum + Noten[i];
        }
        return sum / Noten.length;
    }

    //3.Methode => gibt eine Array mit den abgerundeten Noten zuruck
    public static int[] Abrundung(int[] Noten){
        int[] tempNoten = new int[Noten.length];
        for(int i=0; i < Noten.length;i++){
            tempNoten[i]= Noten[i];
        }
        for(int i=0; i< tempNoten.length; i++){
            if((tempNoten[i]+1) % 5 == 0 && tempNoten[i] >= 30)
            {
                tempNoten[i] = tempNoten[i]+1;
            }
            if((tempNoten[i]+2)%5 ==0 && tempNoten[i] >= 30){
                tempNoten[i] = tempNoten[i]+2;
            }
        }
        return tempNoten;
    }

    //4.Methode => liefert die maximale abgerundete Note
    public static int MaxNote(int[] Noten){
        int[] abgerundet = Abrundung(Noten);
        int max = 0;
        for(int i=0; i<Noten.length; i++){
            if(Noten[i] != abgerundet[i]){
                if(abgerundet[i] > max){
                    max = abgerundet[i];
                }
            }
        }
        return max;
    }
}
