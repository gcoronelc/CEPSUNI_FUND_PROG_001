/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ceps.uni.apppromedio.services;

/**
 *
 * @author MASTER
 */
public class PromedioServices {
    public static int calcPromedio(int pp, int ep, int ef){
    int pf;
    
    pf = (int)(pp*0.40 + ep*0.20 + ef*0.40);
        return pf;
    }
    
    public static String obtenerCodigo(int pf){
        String condicion = "Aprobado";        
        if(pf < 14){
            condicion= "Desaprobado";
        }
        return condicion;
    }
}
