package pe.egcc.mateapp.service;

import pe.egcc.mateapp.model.MateModel;

public class MateService {

  public static MateModel procesarNumeros(MateModel model) {
    // -------------------------------------------------
    // Proceso
    // -------------------------------------------------
    // Variables
    int mcd, mcm;
    // Proceso: Aplicando el principio "Divide y Venceras".
    mcd = calcMcd(model.getNum1(), model.getNum2());
    mcm = calcMcm(model.getNum1(), model.getNum2());
    // Reporte
    model.setMcm(mcm);
    model.setMcd(mcd);
    // -------------------------------------------------
    return model;
  }

  private static int calcMcd(int num1, int num2) {
    while (num1 != num2) {
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }

  private static int calcMcm(int num1, int num2) {
    int mcm;
    mcm = num1 * num2 / calcMcd(num1, num2);
    return mcm;
  }

}
