
package mahasiswa;

public class Mahasiswa {
    String nama;
    String tempat;

    void membaca(){
        System.out.println(this.nama + " sedang membaca di " + this.tempat);
    }
    
    void nyontek(){
        System.out.println(this.nama + " menyontek saat UAS berlangsung");
    }
    
    void modifikasi(){
        System.out.println(this.nama + " sedang memodifikasi tugasnya");
    }
            
}
