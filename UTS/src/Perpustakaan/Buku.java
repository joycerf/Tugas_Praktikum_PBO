/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author joyce
 */
public class Buku {
    String genre;
    String judul;
    
    public Buku(String genre, String judul){
        this.genre = genre;
        this.judul = judul;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getJudul(){
        return judul;
    }
}
