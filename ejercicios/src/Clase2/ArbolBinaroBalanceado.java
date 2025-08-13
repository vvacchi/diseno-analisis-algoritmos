package Clase2;

public class ArbolBinaroBalanceado {


    class Nodo {
        int valor;
        Nodo izquierda;
        Nodo derecha;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }


    public int altura(Nodo _raiz) {
        if (_raiz == null) {
            return 0;
        }
        int alturaIzquierda = altura(_raiz.izquierda);
        int alturaDerecha = altura(_raiz.derecha);
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    public static void main(String[] args) {
        ArbolBinaroBalanceado arbol = new ArbolBinaroBalanceado();


        Nodo raiz = arbol.new Nodo(10);
        raiz.izquierda = arbol.new Nodo(5);
        raiz.derecha = arbol.new Nodo(15);
        raiz.izquierda.izquierda = arbol.new Nodo(3);
        raiz.izquierda.derecha = arbol.new Nodo(7);
        raiz.derecha.izquierda = arbol.new Nodo(12);
        raiz.derecha.derecha = arbol.new Nodo(18);


        System.out.println("La altura (largo) del árbol es: " + arbol.altura(raiz));
    }

    /*
    costo del algotirmo
    O(n)
    para cuando recorremos todo el arbol
     */
}
