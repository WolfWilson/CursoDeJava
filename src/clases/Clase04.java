package clases;
import java.util.Scanner;
import clases.Operador;
public class Clase04 {

    public static void main(String[] args) {
        Operador operador = new Operador();

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese primer n�mero");
        int num1 = teclado.nextInt();
        System.out.println("ingrese segundo n�mero");
        int num2 = teclado.nextInt();
        System.out.println("ingrese la operaci�n");
        int operacion = teclado.nextInt();

        System.out.println(operador.resolver(num1, num2, operacion));

        teclado.close();

    }

}


