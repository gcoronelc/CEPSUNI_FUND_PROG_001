package pe.ceps.uni.ejercicio03.services;

import java.util.Arrays;

public class Servicios {

  public static int calcNumeroMayor(int a, int b, int c, int d, int e) {
    int mayor;
    int[] lista = {a,b,c,d,e};
    Arrays.sort(lista);
    mayor = lista[4];
    return mayor;
  }

}
