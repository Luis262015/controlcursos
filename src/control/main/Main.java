package control.main;

import control.controllers.MainController;

/**
 *
 * @author Luis Isla A
 * @version 1.0
 */


public class Main {
  
  public static void main (String[] args){
    MainController mainController = new MainController();
    mainController.listar();
  }
  
}
