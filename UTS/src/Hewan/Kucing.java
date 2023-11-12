/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author joyce
 */
public class Kucing extends Hewan {
    public Kucing(String jenisSuara){
        super(jenisSuara);
    }
    
    public String bersuara(){
        System.out.println("Kucing bersuara " + jenisSuara);
        return null;
    }
}
