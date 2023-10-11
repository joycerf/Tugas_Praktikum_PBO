/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai;

/**
 *
 * @author joyce
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mhs1 = new Nilai();
        
        mhs1.NIM = "2210631170075";
        mhs1.Nama = "Joyce Rosita Firdaus";
        mhs1.Absen = 100;
        mhs1.Tugas = 100;
        mhs1.UTS = 90;
        mhs1.UAS = 89;
        mhs1.CetakNilai();
        mhs1.Nilai();
    }
    
}
