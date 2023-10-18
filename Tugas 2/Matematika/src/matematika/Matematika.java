/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

public class Matematika {
    
    int tambah, kurang, kali;
    float bagi;
    
    public void Pertambahan(int a, int b){
        this.tambah = a + b;
        System.out.println("Pertambahan: \n" + a + " + " + b + " = " + tambah + "\n");
    }
    public void Pengurangan(int a, int b){
        this.kurang = a - b;
        System.out.println("Pengurangan: \n" + a + " - " + b + " = " + kurang + "\n");
    }
    public void Perkalian(int a, int b){
        this.kali = a * b;
        System.out.println("Perkalian: \n" + a + " * " + b + " = " + kali + "\n");
    }
    public void Pembagian(int a, int b){
        this.bagi = a / b;
        System.out.println("Pembagian: \n" + a + " / " + b + " = " + bagi + "\n");
    }
}

