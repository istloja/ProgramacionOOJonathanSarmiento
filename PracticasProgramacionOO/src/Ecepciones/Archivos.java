package Ecepciones;

import java.io.File;

public class Archivos {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\dell\\Desktop\\Ejemplo.txt");
        System.out.println(archivo.exists());
        // para saber si directorio, devuelve true o false
        System.out.println(archivo.isDirectory());
        //Para saber la fecha dde modificacion del archivo
        System.out.println(archivo.lastModified());
        //para obtener el nombre del archivo
        System.out.println(archivo.getName());
        //para borrar el archivo
        System.out.println(archivo.delete());
        //para saber los arcivos de una carpeta
        File carpeta = new File("C:\\Users\\dell\\Desktop");
        String[] archivos = carpeta.list();
          for (int i = 0 ;i < archivos.length; i++) {
            System.out.println(archivos[i]);  
        }
    }
}
