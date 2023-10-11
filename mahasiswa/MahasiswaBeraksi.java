/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author joyce
 */
public class MahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.nama = "cece";
        mhs1.tempat = "kelas";
        mhs1.membaca();
        System.out.println(" ");
        mhs2.nama = "yohan";
        mhs2.nyontek();
        System.out.println(" ");
        mhs2.modifikasi();
    }
    
}
