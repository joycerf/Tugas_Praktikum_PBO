/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Admin extends Pengguna {
    public Admin(String jenis){
        super(jenis);
    }
    
    public void pengguna(){
        System.out.println("Halloo " + jenis + "!");
        System.out.println("____________________");
        System.out.println("1. Menambahkan Buku ");
        System.out.println("2. Melihat Buku     ");
        System.out.println("3. Men-Delete Buku  ");
        System.out.println("____________________");
    }
    
    public void pilihan(ArrayList<Buku> addBuku){
        Scanner input = new Scanner(System.in);
        System.out.print("Silahkan Pilih Angka (1 / 2 / 3): ");
        int pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
            case 1:
                System.out.println("Menambahkan Buku");
                System.out.print("Masukkan Genre Buku: ");
                String genre = input.nextLine();
                System.out.print("Masukkan Judul Buku: ");
                String judul = input.nextLine();
                Buku bukuBaru = new Buku(genre, judul);
                addBuku.add(bukuBaru);
                System.out.println("Buku Berhasil Ditambahkan!");
                break;
            case 2:
                System.out.println("Melihat Buku");
                for (Buku lihatbuku : addBuku){
                    System.out.println("___________________");
                    System.out.println("Judul: " + lihatbuku.getJudul());
                    System.out.println("Genre: " + lihatbuku.getGenre());
                }
                break;
            case 3:
                System.out.println("Men-Delete Buku");
                 System.out.print("Masukkan Judul Buku yang akan dihapus: ");
                    String judulHapus = input.nextLine();
                    boolean bukuDitemukan = false;
                    for (Buku hapusbuku : addBuku) {
                        if (hapusbuku.getJudul().equalsIgnoreCase(judulHapus)) {
                            addBuku.remove(hapusbuku);
                            bukuDitemukan = true;
                            System.out.println("Buku berhasil dihapus!");
                            break;
                        }
                break;
                }
            default:
                System.out.println("Pilihan yang Anda Masukkan Tidak Terdaftar. Silahkan Pilih 1, 2, atau 3");
        }
    }

}
