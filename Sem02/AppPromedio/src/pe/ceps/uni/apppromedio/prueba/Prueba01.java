package pe.ceps.uni.apppromedio.prueba;

import pe.ceps.uni.apppromedio.service.PromedioService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int pp = 16;
    int ep = 6;
    int ef = 18;
    // Proceso
    int pf = PromedioService.calcPromedio(pp, ep, ef);
    String cond = PromedioService.obtenerCondicion(pf);
    // Reporte
    System.out.println("Promedio: " + pf);
    System.out.println("Condición: " + cond);
  }
  
}
