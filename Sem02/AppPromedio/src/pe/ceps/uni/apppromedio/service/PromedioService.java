package pe.ceps.uni.apppromedio.service;

public class PromedioService {
  
  public static int calcPromedio(int pp, int ep, int ef){
    int pf;
    // ----------------------------------------------------------
    // Proceso
    // ----------------------------------------------------------
    pf = (int) (pp * 0.40 + ep * 0.20 + ef * 0.40);    
    // ----------------------------------------------------------
    return pf;
  }
  
  public static String obtenerCondicion(int pf){
    String condicion;
    // ----------------------------------------------------------
    // Proceso
    // ----------------------------------------------------------
    condicion = "Aprobado";
    if(pf < 14){
      condicion = "Desaprobado";
    }
    // condicion = (pf>=14)?"Aprobado":"Desaprobado";
    // ----------------------------------------------------------
    return condicion;
  }
  
  
}
