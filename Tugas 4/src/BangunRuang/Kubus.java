/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author joyce
 */
public class Kubus extends Balok {
    double s;
    
    public Kubus(double p){
        super(p);
        this.s = p;      //sisi = panjang
    }
    
    public double VolumeKubus(){
        return s*s*s;
    }
    
    public double LPKubus(){
        return 6*s*s;
    }
}
