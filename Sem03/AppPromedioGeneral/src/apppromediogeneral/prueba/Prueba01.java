package apppromediogeneral.prueba;

import apppromediogeneral.model.PromedioModel;
import apppromediogeneral.services.PromedioService;

public class Prueba01 {
    
    public static void main(String[] args) {
        // Datos
        PromedioModel model = new PromedioModel();
        model.setPc1(16);
        model.setPc2(18);
        model.setPc3(20);
        model.setPc4(10);
        model.setEp(10);
        model.setEf(10);
        // Proceso
        model = PromedioService.calcPromedio(model);
        // Reporte
        System.out.println("Practica menor: " + model.getNotaPcMenor());
        System.out.println("Promedio practicas: " + model.getPromPC());
        System.out.println("Promedio Final: " + model.getPromFinal());
        System.out.println("Condición: " + model.getCondicion());
    }
}
