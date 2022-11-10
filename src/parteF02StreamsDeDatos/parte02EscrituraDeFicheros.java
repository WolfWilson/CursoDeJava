package parteF02StreamsDeDatos;

import java.io.FileWriter;

class parte02EscrituraDeFicheros {

    public static void main(String[]args){
        Escritura escribeElArchivo = new Escritura();
        escribeElArchivo.escribir();
    }

}

class Escritura{
    public void escribir(){
        String texto = "ESTO FUE ESCRITO Esto se escribi� en el archivo desde el programa. "; /*lo que queremos que se escriba en el archivo.*/

        try {
            /*FileWrite s�lo con el parametro nombre de archivo re-escribe el archivo por completo
              FileWrite con par�metro nombre de archivo y el segundo true agrega a lo que ya tiene el archivo.*/

            FileWriter escriturua = new FileWriter("archivo2.txt", true);

            for(int i =0; i < texto.length(); i++){ /* Para escribir recorremos caractear a caracter el String. */
                escriturua.write(texto.charAt(i)); /* Escribe letra por letra en el archivo.*/
            }
            escriturua.write("\n"); /*el \n es para que haga un salto de l�nea al final de la escritura.*/
            escriturua.close(); /*Como no usamos m�s cerramos el FileWriter*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
