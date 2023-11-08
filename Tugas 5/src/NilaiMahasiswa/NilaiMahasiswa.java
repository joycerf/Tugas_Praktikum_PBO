/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NilaiMahasiswa;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        int absen = input.nextInt();
        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas = input.nextDouble();
        
        System.out.println();
        double nilaiakhir;
        nilaiakhir = (0.1*absen) + (0.2*tugas) + (0.3*uts) + (0.4*uas);
        
        System.out.println("Berikut Data Mahasiswa Anda");
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiakhir);
        
        char grade;
        String ket;
        if(nilaiakhir >= 76){
            grade = 'A';
            ket = "ISTIMEWA";
        } else if(nilaiakhir >= 66){
            grade = 'B';
            ket = "BAIK";
        } else if(nilaiakhir >= 56){
            grade = 'C';
            ket = "CUKUP";
        } else if(nilaiakhir >= 46){
            grade = 'D';
            ket = "KURANG";
        } else {
            grade = 'E';
            ket = "KURANG SEKALI";
        }
        
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + ket);
    }
    
}
