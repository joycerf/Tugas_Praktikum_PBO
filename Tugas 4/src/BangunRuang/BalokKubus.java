/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author joyce
 */
public class BalokKubus {

    public static void main(String[] args) {

        Balok balok = new Balok(2,1,4);
        Kubus kubus = new Kubus(3);
        
        System.out.println("Volume Balok: " + balok.VolumeBalok());
        System.out.println("Luas Permukaan Balok: " + balok.LPBalok());
        System.out.println("Volume Kubus: " + kubus.VolumeKubus());
        System.out.println("Luas Permukaan Kubus: " + kubus.LPKubus());
    }
    
}
