/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perulangan1;

/**
 *
 * @author joyce
 */
public class GanjilGenap {
    public static void main(String[] args) {
        int i;
        
        System.out.println("Bilangan Ganjil 0 - 20: ");
        for(i = 0; i <= 20; i++){
            if(i % 2 != 0){
                System.out.print(i  + " ");
            }
        }
        
        System.out.println("\n");
        
        System.out.println("Bilangan Genap 0 - 20: ");
        for(i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
