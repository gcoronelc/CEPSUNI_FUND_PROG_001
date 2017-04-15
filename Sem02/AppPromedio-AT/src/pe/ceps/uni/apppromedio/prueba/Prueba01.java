/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ceps.uni.apppromedio.prueba;

import pe.ceps.uni.apppromedio.services.PromedioServices;

/**
 *
 * @author MASTER
 */
public class Prueba01 {
    //acceso rapido al constructor "psvm"
    public static void main(String[] args) {
        //Datos
        int pp = 16;
        int ep = 06;
        int ef = 18;
        //Proceso
        int pf = PromedioServices.calcPromedio(pp,ep,ef);
        String cond = PromedioServices.obtenerCodigo(pf);
        //Reporte
        System.out.println("Promedio: " + pf);
        System.out.println("Condicion: " + cond);;
        
    }
    
}
