/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ceps.uni.ejercicio03.services;

/**
 *
 * @author MASTER
 */
public class Servicios {

  public static int calcNumeroMayor(int a, int b, int c, int d, int e) {
    int x = 0;
    int arreglo[] = {a, b, c, d, e};
    x = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if (x < arreglo[i]) {
        x = arreglo[i];
      }
    }
    return x;
  }

}
