/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author joyce
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin admin = new Admin("Admin");
        User user = new User("User");
        
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> buku = new ArrayList();
        
        boolean berjalan = true;
        
        while(berjalan){
            System.out.println("");
            System.out.print("Anda Masuk Sebagai (Admin / User), (Exit jika ingin keluar program): ");
            String pengguna = input.nextLine();
            switch(pengguna){
                case "Admin":
                    admin.pengguna();
                    admin.pilihan(buku);
                    break;
                case "User":
                    user.pengguna();
                    user.pilihan(buku);
                    break;
                case "Exit":
                    berjalan = false;
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    break;
                default:
                    System.out.println("Masukkan tidak valid. Silahkan masukkan 'Admin', 'User', atau 'exit'.");
                }
            }
            
        }
    }
