/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Toko;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class Toko {
    public static void main(String[] args) {
        String[] kode = new String[20];
        int[] jml = new int[20];
        Scanner input = new Scanner(System.in);
        int i;
        int total = 0;
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("************************");
        System.out.println("No\t Kode Barang\t Nama Barang\t Harga");
        System.out.println("================================================");
        System.out.println("1\t a001\t\t Buku\t\t 3000");
        System.out.println("2\t a002\t\t Pensil\t\t 4000");
        System.out.println("3\t a003\t\t Pulpen\t\t 5000");
        System.out.println("================================================");
        
        System.out.print("Masukkan Item Barang : ");
        int item = input.nextInt();
        for(i=0; i<item; i++){
            System.out.println("Data ke " + (i+1));
            System.out.print("Masukkan Kode : ");
            kode[i] = input.next();
            System.out.print("Masukkan Jumlah Beli : ");
            jml[i] = input.nextInt();
        }
        
        System.out.println();
        System.out.println("\t\t\t\tTOKO SERBA ADA");
        System.out.println("****************************************************************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("============================================================================");
        
        for(i=0; i<item; i++){
            System.out.print((i+1) + "\t");
            System.out.print(kode[i] + "\t\t");
            
            switch(kode[i]){
            case "a001":
                System.out.print("Buku\t\t");
                System.out.print(3000 + "\t");
                break;
            case "a002":
                System.out.print("Pensil\t\t");
                System.out.print(4000 + "\t");
                break;
            case "a003":
                System.out.print("Pulpen\t\t");
                System.out.print(5000 + "\t");
                break;
            default :
                System.out.print("Stok Barang Kosong\t");
            }
            
            System.out.print("     " + jml[i] + "\t\t");
            int bayar = jml[i] * harga(kode[i]);
            System.out.println(bayar);
            
            total += bayar;
        }
        
        System.out.println("============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + total);
        System.out.println("============================================================================");
    }
    
    private static int harga(String kode){
        switch(kode){
            case "a001" :
                return 3000;
            case "a002" :
                return 4000;
            case "a003" :
                return 5000;
            default :
                return 0;
        }
    }
    
}
