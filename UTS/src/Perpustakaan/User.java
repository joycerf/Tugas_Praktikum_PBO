/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author joyce
 */
import java.util.ArrayList;
public class User extends Pengguna {
    public User(String jenis){
        super(jenis);
    }
    
    public void pengguna(){
        System.out.println("Halloo " + jenis + "!");
        System.out.println("___________________");
    }
    
    public void pilihan(ArrayList<Buku> addBuku){
        System.out.println("Berikut adalah Daftar Buku di Perpustakaan: ");
        for(Buku buku : addBuku){
            System.out.println("___________________");
            System.out.println("Judul Buku: " + buku.getJudul());
            System.out.println("Genre Buku: " + buku.getGenre());
        }
    }
}
