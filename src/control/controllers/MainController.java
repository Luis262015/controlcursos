package control.controllers;

import java.io.File;

/**
 *
 * @author Luis Isla A
 * @version 1.1
 */


public class MainController {
  
  String url = "";
  
  public void listar(){
    File dir = new File("f://CURSOS");
    String[] ficheros = dir.list();
    if (ficheros == null)
      System.out.println("No hay ficheros en el directorio especificado");
    else { 
      for (int x=0;x<ficheros.length;x++)
        System.out.println(ficheros[x]);
    }
  }
  
}
