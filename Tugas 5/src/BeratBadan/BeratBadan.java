/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BeratBadan;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class BeratBadan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG INDEKS MASSA TUBUH \n");
        System.out.print("Masukkan Berat Badan Anda (kg): ");
        double BB = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan Anda (m): ");
        double TB = input.nextDouble();
        
        System.out.println("");
        System.out.println("-------- TABEL INDEKS MASSA TUBUH --------");
        System.out.println("__________________________________________");
        System.out.println("|   Nilai IMT   |        Kriteria        |");
        System.out.println("|---------------|------------------------|");
        System.out.println("| 18.4 kebawah  | Berat Badan Kurang     |");
        System.out.println("| 18.5 - 24.9   | Berat Badan Ideal      |");
        System.out.println("| 25 - 29.9     | Berat Badan Lebih      |");
        System.out.println("| 30 - 39.39    | Gemuk                  |");
        System.out.println("| 40 keatas     | Sangat Gemuk           |");
        System.out.println("------------------------------------------");
        
        double IMT;
        String kriteria = null;
        
        IMT = BB/(TB*TB);
        if(IMT <= 18.4){
            kriteria = "Berat Badan Kurang";
        } else if(IMT <= 24.9){
            kriteria = "Berat Badan Ideal";
        } else if(IMT <= 29.9){
            kriteria = "Berat Badan Lebih";
        } else if(IMT <= 39.9){
            kriteria = "Gemuk";
        } else if(IMT >= 40){
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("");
        System.out.println("Berikut adalah Hasil Perhitungan IMT Anda: ");
        System.out.println("- Indeks Massa Tubuh Anda adalah " + IMT);
        System.out.println("- Anda Tergolong dalam Kriteria " + kriteria);
    }
    
}
