package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos10 {
    /**Ejercicio 10:
     Escriba un algoritmo que lea un arreglo de n�meros enteros, y un n�mero x, y escriba en la
     pantalla todos los �ndices de las posiciones del arreglo donde est� x. Por ejemplo, si el arreglo
     es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6*/

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

        // Solicitar al usuario el n�mero x
        System.out.println("Ingrese el n�mero x:");
        int x = scanner.nextInt();

        // Encontrar y mostrar los �ndices de las posiciones del arreglo donde est� x
        System.out.println("�ndices de las posiciones donde est� x:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                System.out.print(i + " ");
            }
        }
    }
}
