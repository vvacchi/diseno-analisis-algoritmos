package Clase1;
public class PromedioMatriz {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {{4, 5, 6}, {7, 8, 9}, {5, 6, 7}};
        double suma = 0; //1
        for (int i = 0; i < matriz.length; i++) { // 1 + 2(n+1) + n
            for (int j = 0; j < matriz[i].length; j++) { // 1 + 2(n+1) + n
                suma += matriz[i][j]; 
            }
        }
        double promedio = (double) suma / (matriz.length * matriz[0].length);
        System.out.println("El promedio de la matriz es: " + promedio);
    }
}
