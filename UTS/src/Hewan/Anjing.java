/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author joyce
 */
public class Anjing extends Hewan {
    public Anjing(String jenisSuara){
        super(jenisSuara);
    }
    
    @Override
    public String bersuara(){
        System.out.println("Anjing bersuara " + jenisSuara);
        return null;
    }
    
}
