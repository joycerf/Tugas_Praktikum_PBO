/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perulangan1;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class Lagu {
    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Anak Ayam = ");
        n = input.nextInt();
        System.out.println("");
        
        for(int i = n; i > 0; i--){
            System.out.println("Anak ayam turun " + i);
            System.out.println("Mati satu tinggal " + (i - 1));
            System.out.println("");
        }
    }
    
}
