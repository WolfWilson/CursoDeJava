package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos11 {
    /**Ejercicio 11:
     Un arreglo de n�meros se llama partidario si todo n�mero que est� en una casilla par (0,2,4,�)
     es mayor que cualquiera de los n�meros que est�n en las casillas impares (1,3,5,�). Escriba
     un algoritmo que lea un arreglo de n�meros enteros y luego, diga si es partidario o no. Por
     ejemplo, si el arreglo es el siguiente: 100 5 200 1 1000 0 600 50 300 4 El programa debe
     escribir: es partidario*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario la cantidad de n�meros a ingresar
        System.out.println("Ingrese la cantidad de n�meros enteros:");
        n = scanner.nextInt();

        // Crear un arreglo para almacenar los n�meros enteros
        int[] numeros = new int[n];

        // Solicitar al usuario los n�meros enteros
        System.out.println("Ingrese los n�meros enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Verificar si el arreglo es partidario
        boolean esPartidario = true;
        for (int i = 0; i < n - 1; i += 2) {
            for (int j = 1; j < n; j += 2) {
                if (numeros[i] <= numeros[j]) {
                    esPartidario = false;
                    break;
                }
            }
            if (!esPartidario) {
                break;
            }
        }

        // Imprimir si el arreglo es partidario o no
        if (esPartidario) {
            System.out.println("Es partidario");
        } else {
            System.out.println("No es partidario");
        }
    }
}
