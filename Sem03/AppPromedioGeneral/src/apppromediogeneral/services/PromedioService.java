package apppromediogeneral.services;

import apppromediogeneral.model.PromedioModel;

public class PromedioService {

    public static PromedioModel calcPromedio(PromedioModel model) {

        //variables
        int promFinal, promPC, notaPcMenor;
        String condicion;

        //proceso
        notaPcMenor = calcNotaPcMenor(model.getPc1(), model.getPc2(), model.getPc3(), model.getPc4());
        promPC = calcPromPC(model.getPc1(), model.getPc2(), model.getPc3(), model.getPc4());
        promFinal = calcPromedioFin(promPC, model.getEp(), model.getEf());
        condicion = verCondicion(promFinal);

        //reporte
        model.setNotaPcMenor(notaPcMenor);
        model.setPromPC(promPC);
        model.setPromFinal(promFinal);
        model.setCondicion(condicion);

        return model;
    }

    private static int calcNotaPcMenor(int pc1, int pc2, int pc3, int pc4) {
        int menor = pc1;
        if (menor > pc2) {
            menor = pc2;
        }
        if (menor > pc3) {
            menor = pc3;
        }
        if (menor > pc4) {
            menor = pc4;
        }
        return menor;
    }

    private static int calcPromPC(int pc1, int pc2, int pc3, int pc4) {
        int promPract;
        int menor;
        menor = calcNotaPcMenor(pc1, pc2, pc3, pc4);
        promPract = (pc1 + pc2 + pc3 + pc4 - menor) / 3;
        return promPract;
    }

    private static int calcPromedioFin(int promPract, int ep, int ef) {
        int promFinal;
        promFinal = (int) (promPract * 0.4 + ep * 0.20 + ef * 0.40);
        return promFinal;
    }

    private static String verCondicion(int promFinal) {
        String condicion;
        if (promFinal >= 14) {
            condicion = "Aprobado";
        } else {
            condicion = "Desaprobado";
        }
        return condicion;
    }

}
