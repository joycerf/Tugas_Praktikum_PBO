/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

public class Math implements InterfaceMatematika{
    
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        return a / b;
    }
}

