package pe.egcc.pestamoapp.service;

import pe.egcc.pestamoapp.model.CuotaModel;

public class PrestamoService {

  public static CuotaModel[] procesarPrestamo(int plazo, double capital, double intMes) {
    CuotaModel[] repo = new CuotaModel[plazo];
    // -------------------------------------------------------------------------
    // Variables
    double cuotaCapital, cuotaInteres, cuotaImporte;
    int cuotaMes;
    // Proceo
    cuotaCapital = to2Dec(capital / plazo);
    for (int cont = 0; cont < plazo; cont++) {
      // Calculo de la cuota
      if(cont == (plazo-1)){
        cuotaCapital = to2Dec(capital);
      }
      cuotaMes = cont + 1;
      cuotaInteres = to2Dec(capital * intMes / 100);
      cuotaImporte = to2Dec(cuotaCapital + cuotaInteres);
      CuotaModel model = new CuotaModel();
      model.setMes(cuotaMes);
      model.setCapital(cuotaCapital);
      model.setInteres(cuotaInteres);
      model.setImporte(cuotaImporte);
      repo[cont] = model;
      // Proxima cuota
      capital = capital - cuotaCapital;
    }
    // -------------------------------------------------------------------------
    return repo;
  }

  public static double to2Dec(double valor){
    valor = Math.round(valor * 100.0) / 100.0;
    return valor;
  }
  
}
