package pe.egcc.pestamoapp.prueba;

import pe.egcc.pestamoapp.model.CuotaModel;
import pe.egcc.pestamoapp.service.PrestamoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int plazo = 12;
    double capital = 1200.0;
    double intMes = 5;
    // Proceso
    CuotaModel[] repo = PrestamoService.procesarPrestamo(plazo, capital, intMes);
    // Reporte
    for(CuotaModel model: repo){
      String texto = "";
      texto += model.getMes() + "\t";
      texto += model.getCapital() + "\t";
      texto += model.getInteres() + "\t";
      texto += model.getImporte();
      System.out.println(texto);
    }
    
  }
  
  
}
