package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.model.MateModel;
import pe.egcc.mateapp.service.MateService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    MateModel model = new MateModel();
    model.setNum1(15);
    model.setNum2(20);
    // Proceso
    model = MateService.procesarNumeros(model);
    // Reporte
    System.out.println("Numero 1: " + model.getNum1());
    System.out.println("Numero 2: " + model.getNum2());
    System.out.println("MCD: " + model.getMcd());
    System.out.println("MCM: " + model.getMcm());
  }
  
}
