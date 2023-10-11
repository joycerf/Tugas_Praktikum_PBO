/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai;

/**
 *
 * @author joyce
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    String NIM;
    String Nama;
    int Absen;
    int Tugas;
    int UTS;
    int UAS;
    double NilaiAkhir;
    
    void Nilai(){
        // TODO code application logic here
        this.Absen *= 0.1;
        this.Tugas *= 0.2;
        this.UTS *= 0.3;
        this.UAS *= 0.4;
        this.NilaiAkhir = this.Absen + this.Tugas + this.UTS + this.UAS;
        System.out.println("Nilai Akhir: " + this.NilaiAkhir);
    }
    
    void CetakNilai(){
        
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Nilai Absen: " + this.Absen);
        System.out.println("Nilai Tugas: " + this.Tugas);
        System.out.println("Nilai UTS: " + this.UTS);
        System.out.println("Nilai UAS: " + this.UAS);
        
    }
    
}
