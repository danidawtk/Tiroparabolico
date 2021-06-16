/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW-A
 */
public class Tiro {
    double veloinic;
    double gravedad;
    double alcancemax;
    double alturamax;
    int angulo;

    

    public Tiro(double veloinic, int angulo) {
        this.veloinic = veloinic;
        this.angulo = angulo;
        gravedad = 9.8;
        alcancemax = (Math.pow(veloinic,2))*Math.sin(2*Utilidades.gradosAradianes(angulo))/gravedad;
        alturamax = (Math.pow(veloinic, 2))*(Math.pow(Utilidades.gradosAradianes(angulo), 2))/2*gravedad;
        
    }
     
    
    public double getVeloinic() {
        return veloinic;
    }

    public double getGravedad() {
        return gravedad;
    }

    public double getAlcancemax() {
        return alcancemax;
    }

    public double getAlturamax() {
        return alturamax;
    }

    public int getAngulo() {
        return angulo;
    }
    
    
}
