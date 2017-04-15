package pe.ceps.uni.ejercicio03.services;

public class Servicios {

  public static int calcNumeroMayor(int a, int b, int c, int d, int e) {
    int mayor = a;
    if(mayor < b){
      mayor = b;
    }
    if(mayor < c){
      mayor = c;
    }
    if(mayor < d){
      mayor = d;
    }
    if(mayor < e){
      mayor = e;
    }
    return mayor;
  }

}
