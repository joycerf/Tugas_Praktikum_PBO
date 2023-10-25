/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

public class Matematika2 extends Matematika {
    public int mod;
    
    public void Modulus(int a, int b){
        this.mod = a % b;
        System.out.println("Modulus: \n" + a + " % " + b + " = " + mod);
}
}
