/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hewan;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class Hewanku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anjing anjing = new Anjing("Guk Guk");
        Kucing kucing = new Kucing("Meong");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jenis Hewan (Kucing/Anjing): ");
        String hewan = input.nextLine();
        if(hewan.equalsIgnoreCase("Kucing")){
            kucing.bersuara();
            System.out.println("Kucing merupakan Hewan Mamalia");
        } else if(hewan.equalsIgnoreCase("Anjing")){
            anjing.bersuara();
            System.out.println("Anjing merupakan Hewan Mamalia");
        } else{
            System.out.println("Jenis Hewan Tidak Diketahui");
        }
            
        
    }    
}
