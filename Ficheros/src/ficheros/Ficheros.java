package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class Ficheros {

    public static void escribeArchivo(File archivo) throws FileNotFoundException {
//        if(archivo.exists()){
//            System.out.println("El archivo ya existe");
//            System.exit(0);
//        }
        /*Si el fichero no existe, lo creamos*/
        PrintWriter salida = new PrintWriter(archivo);
        /*Escribimos en el archivo*/
        salida.print("Antonio Flores");
        salida.println(" 80");
        salida.print("Lola Flores");
        salida.println(" 40");
        //PODEMOS OBSERVAR QUE SI NO SE CIERRA EL FICHERO, NO OBTENEMOS EL RESULTADO DESEADO: 
        /////////////////--------------------LA INFORMACIÓN NO SE GUARDA-----------------------//////////////////
        salida.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/ficheros/datos");
        System.out.println("Existe el fichero?: " + file.exists());
        System.out.println("El fichero tiene  " + file.length() + " bytes");
        System.out.println("Se puede leer?: " + file.canRead());
        System.out.println("Se puede escribir?: " + file.canWrite());
        System.out.println("Es un directorio: " + file.isDirectory());
        System.out.println("Es un archivo: " + file.isFile());
        System.out.println("La ruta es absoluta: " + file.isAbsolute());
        System.out.println("Está oculto?: " + file.isHidden());
        System.out.println("La ruta absoluta es: " + file.getAbsolutePath());
        System.out.println("La última modificación fue en : "
                + new Date(file.lastModified()));
        escribeArchivo(file);

    }

}
