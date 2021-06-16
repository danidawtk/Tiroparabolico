/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW-A
 */
public class Utilidades {
    
    public static ArrayList<String> CalculaAngulos(){
        int angulo=-10;
        ArrayList<String> listaAngulos = new ArrayList<String>();
        for ( int i=0; i<=18;i++){
            angulo=angulo+10;
            listaAngulos.add(String.valueOf(angulo));
        }
        return listaAngulos;
    }
    
    public static double gradosAradianes(int grados){
        double radianes=0;
        
        radianes=grados*Math.PI/180;
        
        return radianes;
    }
    
    public static ArrayList<Coordenada> getCoordenadas(double alcance, double veloinic, int angulo){
        double intervalo = alcance/10;
        ArrayList<Coordenada> listaCoordenadas = new ArrayList<Coordenada>();
        for(int i=0;i<10;i++){
            double x=i*intervalo;
            double y=x*Math.tan(Utilidades.gradosAradianes(angulo))-9.8*Math.pow(x, 2)/2*Math.pow(veloinic, 2)*Math.pow(Math.cos(Utilidades.gradosAradianes(angulo)), 2);
        
            Coordenada miCoordenada = new Coordenada(x,y);
            
            listaCoordenadas.add(miCoordenada);
        
        }
        return listaCoordenadas;
    }
}
