package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos08 {
    /**Ejercicio 8:
     Dise�e un algoritmo que lea un n�mero cualquiera y lo busque en un arreglo X, el cual tiene
     almacenado 10 elementos num�ricos. Escriba la posici�n donde se encuentra almacenado el
     n�mero en el arreglo o el mensaje �NO� si no lo encuentra.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;

        // Crear un arreglo X de 10 elementos num�ricos
        int[] arregloX = new int[n];

        // Solicitar al usuario los elementos del arreglo X
        System.out.println("Ingrese los elementos del arreglo X:");
        for (int i = 0; i < n; i++) {
            arregloX[i] = scanner.nextInt();
        }

        // Solicitar al usuario el n�mero a buscar
        System.out.println("Ingrese el n�mero a buscar:");
        int numeroBuscado = scanner.nextInt();

        // Buscar el n�mero en el arreglo X
        int posicion = -1;
        for (int i = 0; i < n; i++) {
            if (arregloX[i] == numeroBuscado) {
                posicion = i;
                break;
            }
        }

        // Imprimir la posici�n donde se encuentra almacenado el n�mero en el arreglo
        // o el mensaje "NO" si no se encuentra
        if (posicion == -1) {
            System.out.println("NO");
        } else {
            System.out.println("El n�mero " + numeroBuscado + " se encuentra en la posici�n " + posicion + " del arreglo.");
        }
    }
}
