/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author joyce
 */
public class Balok {
    double p, l, t;
    
    protected Balok(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    public Balok(double p){
        this.p = p;
    }
    
    public double VolumeBalok(){
        return p*l*t;
    }
    
    public double LPBalok(){
        return ((p*l)+(p*t)+(l*t))*2;
    }
}
