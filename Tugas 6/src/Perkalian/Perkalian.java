/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perkalian;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class Perkalian {
    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tabel Perkalian yang Anda Inginkan: ");
        n = input.nextInt();

        System.out.println("__________________________");
        System.out.println("| TABEL PERKALIAN " + n + " X " + n + " |");
        System.out.println("--------------------------\n");
        
        for(int i = 1; i <= n; i++){
            System.out.print("\t" + i);
        }
        System.out.println();
        
        for(int i = 1; i <= n; i++){
            System.out.print("---------");
        }
        System.out.println();
        
        for(int i = 1; i <= n; i++){
            System.out.print(i + "  |\t");
            for(int j = 1; j <= n; j++){
                System.out.print(i*j + "\t");    
            }
            System.out.println();
        }
    }
    
}
