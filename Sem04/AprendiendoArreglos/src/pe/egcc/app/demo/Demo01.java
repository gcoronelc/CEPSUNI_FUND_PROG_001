package pe.egcc.app.demo;

import java.util.Arrays;

public class Demo01 {

  public static void main(String[] args) {
    
    int notas[] = new int[5];
   
    mostrar(notas);
    
    notas[0] = 10;
    notas[1] = 20;
    notas[2] = 16;
    notas[3] = 18;
    notas[4] = 17;
       
    mostrar(notas);
    
    // Ordena en forma ascendente
    Arrays.sort(notas);
    
    mostrar(notas);
    
  }

  private static void mostrar(int[] datos) {
    System.out.println("------------------------------");
    for (int i = 0; i < datos.length; i++) {
      System.out.println(i + ".- " + datos[i]);
    }
  }
    
}
