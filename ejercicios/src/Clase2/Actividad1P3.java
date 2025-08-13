package Clase2;

public class Actividad1P3 {
     int suma = 0;
    public static int SumaNInt(int n, int _suma){
        if (n==1){
           return _suma+1 ;
        } else {
            return SumaNInt(n-1, _suma+1);

        }
        /*
        costo en notacion big O del algoritmo

        T(n) = T(n-1)+O(1)
        O(n)
         */

    };
}
