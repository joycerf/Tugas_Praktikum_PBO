/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perulangan1;

/**
 *
 * @author joyce
 */
public class Prima {
    public static void main(String[] args) {
        int i;
        
        System.out.println("Bilangan Prima 1 - 20:");
        for (i = 2; i <= 20; i++){
            if(isPrima(i)){
                System.out.print(i + " ");
            } 
        }
        
        System.out.println("\n");
        
        System.out.println("Bukan Bilangan Prima 1 - 20:");
        for (i = 1; i <= 20; i++){
            if(!isPrima(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrima(int i){
        if(i <= 1){
                return false;
            }
        
        for(int j = 2; j < i; j++){
            if (i % j == 0){
                return false;
                    
            }
        }
        return true;    
    }
}
        
