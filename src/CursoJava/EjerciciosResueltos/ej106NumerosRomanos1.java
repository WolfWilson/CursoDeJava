package CursoJava.EjerciciosResueltos;

public class ej106NumerosRomanos1 {
  /**
   * 6) Elaborar una solución que permita al usuario ingresar un número entero del
   * 1 al 10 y muestre su
   * equivalente en números romanos.
   */
  public static void main(String[] args) {
    // pedido al usuario por consola del número entero
    System.out.println("Ingrese un número entero del 1 al 10: ");
    int numero = Integer.parseInt(System.console().readLine());
    // conversión de número entero a número romano
    String numeroRomano = "";
    switch (numero) {
      case 1:
        numeroRomano = "I";
        break;
      case 2:
        numeroRomano = "II";
        break;
      case 3:
        numeroRomano = "III";
        break;
      case 4:
        numeroRomano = "IV";
        break;
      case 5:
        numeroRomano = "V";
        break;
      case 6:
        numeroRomano = "VI";
        break;
      case 7:
        numeroRomano = "VII";
        break;
      case 8:
        numeroRomano = "VIII";
        break;
      case 9:
        numeroRomano = "IX";
        break;
      case 10:
        numeroRomano = "X";
        break;
      default:
        numeroRomano = "Número no válido.";
        break;
    }
    System.out.println("El número " + numero + " en números romanos es: " + numeroRomano + ".");
  }
}
