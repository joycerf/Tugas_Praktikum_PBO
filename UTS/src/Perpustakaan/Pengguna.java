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
public abstract class Pengguna {
    public String jenis;
    //public int pilih;
    
    protected Pengguna(String jenis){
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public abstract void pilihan(ArrayList<Buku> addBuku);
    
    public abstract void pengguna();
    
}
