package pe.egcc.app.demo;

import java.util.Arrays;

public class Demo02 {

  public static void main(String[] args) {
    
    int notas[] = {16,12,20,14,11};
   
    mostrar(notas);
    
    // Cambiar una nota
    notas[2] = 18;
    mostrar(notas);
    
    // Cambiar todas las notas
    notas = new int[]{17,13,20,14,18,16};
    mostrar(notas);
  }

  private static void mostrar(int[] datos) {
    System.out.println("------------------------------");
    for (int i = 0; i < datos.length; i++) {
      System.out.println(i + ".- " + datos[i]);
    }
  }
    
}
