package Clase2;


class AVLTree {

        class Node {
            String nombre;
            int puntaje;
            int altura;
            Node izquierda, derecha;

            Node(String nombre, int puntaje) {
                this.nombre = nombre;
                this.puntaje = puntaje;
                this.altura = 1;
            }
        }

        Node raiz;


        int altura(Node n) {
            return (n == null) ? 0 : n.altura;
        }


        Node rotacionDerecha(Node y) {
            Node x = y.izquierda;
            Node T2 = x.derecha;

            x.derecha = y;
            y.izquierda = T2;

            y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;
            x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;

            return x;
        }

        Node rotacionIzquierda(Node x) {
            Node y = x.derecha;
            Node T2 = y.izquierda;

            y.izquierda = x;
            x.derecha = T2;

            x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;
            y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;

            return y;
        }

        int balance(Node n) {
            return (n == null) ? 0 : altura(n.izquierda) - altura(n.derecha);
        }


        Node insertar(Node nodo, String nombre, int puntaje) {
            if (nodo == null) {
                return new Node(nombre, puntaje);
            }

            if (puntaje < nodo.puntaje)
                nodo.izquierda = insertar(nodo.izquierda, nombre, puntaje);
            else if (puntaje > nodo.puntaje)
                nodo.derecha = insertar(nodo.derecha, nombre, puntaje);
            else
                return nodo;

            nodo.altura = 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));

            int balance = balance(nodo);


            if (balance > 1 && puntaje < nodo.izquierda.puntaje)
                return rotacionDerecha(nodo);

            if (balance < -1 && puntaje > nodo.derecha.puntaje)
                return rotacionIzquierda(nodo);

            if (balance > 1 && puntaje > nodo.izquierda.puntaje) {
                nodo.izquierda = rotacionIzquierda(nodo.izquierda);
                return rotacionDerecha(nodo);
            }

            if (balance < -1 && puntaje < nodo.derecha.puntaje) {
                nodo.derecha = rotacionDerecha(nodo.derecha);
                return rotacionIzquierda(nodo);
            }

            return nodo;
        }

        public void insertar(String nombre, int puntaje) {
            raiz = insertar(raiz, nombre, puntaje);
        }


        void buscarEnRango(Node nodo, int min, int max) {
            if (nodo == null) return;


            if (min < nodo.puntaje)
                buscarEnRango(nodo.izquierda, min, max);


            if (nodo.puntaje >= min && nodo.puntaje <= max)
                System.out.println(nodo.nombre + " - Puntaje: " + nodo.puntaje);


            if (max > nodo.puntaje)
                buscarEnRango(nodo.derecha, min, max);
        }

        public void buscarEnRango(int min, int max) {
            buscarEnRango(raiz, min, max);
        }
        /*
        si esta balanceado el costo es
        O(log n)
        sino
        O(n)
         */
}



