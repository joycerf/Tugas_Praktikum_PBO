/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PotonganHarga;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class PotonganHarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int potongan, totalbeli, bayar;
        Scanner input = new Scanner(System.in);
        System.out.print("Total Pembelian: ");
        totalbeli = input.nextInt();
        if(totalbeli < 50000){
            potongan = totalbeli * 5/100;
            bayar = totalbeli - potongan;
        } else{
            potongan = totalbeli * 20/100;
            bayar = totalbeli - potongan;
        }
        
        System.out.println("Besarnya Potongan: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan: " + bayar);
    }
    
}
