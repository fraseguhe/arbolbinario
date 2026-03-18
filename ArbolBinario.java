import java.util.Arrays;

// aca iniciamos el archivo, creamos la clase nodo que contara con un numero y 2 nodos derecho e izquierdo que por defecto seran nulos
public class ArbolBinario {
    static class Nodo {
        int numero;
        Nodo izquierdo, derecho;
        Nodo(int numero) {
            this.numero = numero;
            izquierdo = derecho = null;
        }
    }
    //aca se crea la clase arbol que tendra un nodo raiz
    static class Arbol {
        Nodo raiz;

        // aca se crea un metodo privado para poder usarlo luego en cada llamado del metodo publico de añadir, este metodo privado se encargara de crear un nuevo nodo con el numero que se le pase por parametro y luego lo anexara al arbol dependiendo de su valor
        private Nodo añadirPrivado(Nodo nodo, int numero) {
            //aca se crea un nuevo nodo si el nodo actual es nulo
            if (nodo == null) return new Nodo(numero);
            //aca se compara el numero que se le paso por parametro con el numero del nodo actual, si es menor se llama recursivamente al metodo para el nodo izquierdo, si es mayor se llama recursivamente al metodo para el nodo derecho
            if (numero < nodo.numero) {
                nodo.izquierdo = añadirPrivado(nodo.izquierdo, numero);
            }
            //aca se va a comprobar si el numero es mayor que el numero del nodo actual, si es mayor se asignara el valor al nodo derecho
            else if (numero > nodo.numero) {
                nodo.derecho = añadirPrivado(nodo.derecho, numero);
            }
            return nodo;
        }
        // aca creare el metodo para poder anexar nuevos nodos al arbol que usa el metodo de privado de antes
        public void añadir(int numero) {
            raiz = añadirPrivado(raiz, numero);
        }
        //aca creare el metodo para buscar el numero que se desee
        public void buscar(int valor) {
            Nodo actual = raiz;
            while (actual != null) {
                if (valor == actual.numero) {
                    System.out.println(valor + " encontrado en el arbol");
                    return;
                }
                if (valor < actual.numero) {
                    actual = actual.izquierdo;
                } else {
                    actual = actual.derecho;
                }
            }
            System.out.println(valor + " NO existe en el arbol.");
        }
        //aca se pone un metodo privado orden para imprimir los valores de todo el arbol organizados de menor a mayor
        private void ordenPrivado(Nodo nodo) {
            if (nodo == null)
                return;
            ordenPrivado(nodo.izquierdo);
            System.out.print(nodo.numero + ", ");
            ordenPrivado(nodo.derecho);
        }
        //aca se llama el metodo privado para imprimir todos los nodos en orden dentro del metodo orden aplicado al nodo raiz
        public void orden() {
            System.out.println("El orden de los nodos es:");
            ordenPrivado(raiz);
            System.out.println();
        }
    }
    //aca instanciamos el main
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        //aca se crea la lista con la que va a trabajar nuestro arbol
        int[] numeros = {50, 30, 70, 20, 40, 60, 80, 35, 45};
        // y aca se pone un ciclo for que se ejecute por cada numero que tenga la lista
        for (int v : numeros) arbol.añadir(v);
        //aca añado un print con los numeros de la lista
        System.out.println("Arbol creado con: " + Arrays.toString(numeros));
        //aca se imprime en orden el arbol
        arbol.orden();
        // aca se prueba el metodo buscar
        System.out.println();
        arbol.buscar(40);
        arbol.buscar(60);
        arbol.buscar(99);
        arbol.buscar(50);
    }
}