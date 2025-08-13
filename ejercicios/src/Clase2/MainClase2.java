package Clase2;
import  org.example.Clase2.*;
public class MainClase2 {
    public static void main(String[] args) {
            Actividad1P3 actividad1P3 = new Actividad1P3();

            int sum= actividad1P3.SumaNInt(10,0);
        System.out.println("sum = " + sum);




       AVLTree arbol = new AVLTree();

        arbol.insertar("Juan", 50);
        arbol.insertar("Ana", 70);
        arbol.insertar("Pedro", 30);
        arbol.insertar("Luis", 90);
        arbol.insertar("Maria", 60);

        System.out.println("Jugadores con puntaje entre 40 y 80:");
        arbol.buscarEnRango(40, 80);
    }
}
// el costo de los dos ejercicios que se ejecutan aqui se
// encuentra en sus respectivas clases
