package parteZ01Final_2022_02_23;

import java.util.Scanner;

public class interaccion {
    public static void main(String args[]) {

        Personal personal = new Personal();
        int opcion = 99;
        Scanner entrada = new Scanner(System.in);

        try {
            while (opcion != 0) {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Ingrese el apellido: ");
                        String apellido = entrada.next();
                        System.out.println("Ingrese el dni: ");
                        int dni = entrada.nextInt();
                        System.out.println("Ingrese el salario b�sico: ");
                        double salario = entrada.nextDouble();
                        System.out.println("�Es un empleado o un jefe?");
                        String tipo = entrada.next();
                        if (tipo.equals("empleado")) {
                            Empleado empleado = new Empleado(nombre, apellido, dni, salario);
                            personal.addPersona(empleado);
                        } else {
                            System.out.println("Ingrese el porcentaje: ");
                            double porcentaje = entrada.nextDouble();
                            Jefe jefe = new Jefe(nombre, apellido, dni, salario, porcentaje);
                            personal.addPersona(jefe);
                        }
                        break;
                    case 2:
                        personal.listarPersonas();
                        break;
                    case 3:
                        System.out.println("Ingrese el dni: ");
                        int dniEliminar = entrada.nextInt();
                        personal.eliminarPersona(dniEliminar);
                        break;
                    case 4:
                        System.out.println("Ingrese el dni: ");
                        int dniBuscar = entrada.nextInt();
                        personal.buscarPersona(dniBuscar);
                        break;
                    case 5:
                        System.out.println("Ingrese el dni: ");
                        int dniModificar = entrada.nextInt();
                        personal.modificarPersona(dniModificar);
                        break;
                    case 6:
                        System.out.println("Ingrese el dni: ");
                        int dniAumentar = entrada.nextInt();
                        System.out.println("Ingrese el monto a aumentar ");
                        double monto = entrada.nextDouble();
                        personal.aumentarSalario(dniAumentar, monto);
                        break;
                    case 7:
                        System.out.println("Ingrese el dni: ");
                        int dniVerSueldo = entrada.nextInt();
                        personal.verSueldo(dniVerSueldo);
                        break;
                    case 99:
                        opcion = 99;
                        break;
                    default:
                        System.out.println("Ingrese una opci�n v�lida");
                }

                System.out.println(
                        "\n ---------------------- \n" +
                                "1. Crear una Persona\n" +
                                "2. Listar Personas\n" +
                                "3. Eliminar Persona\n" +
                                "4. Buscar Persona\n" +
                                "5. Modificar datos de una Persona\n" +
                                "6. Subir sueldo\n" +
                                "7. ver sueldo\n" +
                                "0. Salir\n" +
                                "Ingrese la opci�n:"
                );

                opcion = entrada.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error en el ingreso de datos!");
            opcion = 99;
        }

    }
}

/**
 * 1. Respetar el encapsulamiento.
 *
 * 2. Todos los errores deben ser capturados para enviar el mensaje al usuario: "Error en el ingreso de datos!". Dicho error significa la interrupci�n segura del programa.
 *
 * 3. Debe haber por lo menos dos clases Jefe y Empleado que heredan de la clase abstracta Persona.
 *
 * 4. Una clase Interacci�n que permita la ejecuci�n del programa y la comunicaci�n con el usuario para que se puedan desarrollar todas las tareas del programa por medio de un men� que indique al usuario lo que debe ingresar y ver el resultado de sus acciones.
 *
 * 5. El programa debe permitir cargar Jefes y Empleados.
 *
 * 6. Si se cargan jefes tambi�n se debe cargar un monto adicional llamado porcentaje que se suma al salario b�sico.
 *
 * 7. Listar personas con todos sus datos.
 *
 * 8. Eliminar personas indicando su DNI
 *
 * 9. Buscar personas indicando su DNI.
 *
 * 10. Modificar los datos de una persona indicando su DNI.
 *
 * 11. Ver el sueldo de una persona.
 *
 * 12. S�lo se puede salir del programa si el usuario lo indica. En caso contrario el programa debe permitir la realizaci�n de cualquier operaci�n descrita.
 *
 * 13. La clase Persona tendr� por lo menos un m�todo abstracto para subir el sueldo que en el caso de Empleado significa la suma de un monto al sueldo b�sico y en el caso de Jefe significa la suma de un monto m�s el porcentaje indicado en su creaci�n al sueldo b�sico sumado todo al sueldo b�sico.
 *
 * 14. La clase Persona tendr� por lo menos un m�todo abstracto que permitir� ver el sueldo de una persona, el cual en el caso de un empleado significa ver el sueldo b�sico y en el caso de un Jefe ser� el sueldo b�sico m�s el porcentaje indicado en la creaci�n de un jefe.
 *
 * 15. Se debe respetar el diagrama de clases indicado.
 */