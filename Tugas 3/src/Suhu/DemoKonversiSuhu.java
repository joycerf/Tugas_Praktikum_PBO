/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Suhu;

public class DemoKonversiSuhu {

    public static void main(String[] args) {

        float suhu1 = 37;
        float suhu2 = 60;
        float suhu3 = 77;
        
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        konversi.CelciusToFahrenheit(suhu1);
        System.out.println("Suhu " + suhu1 + " derajat celcius dikonversi ke fahrenheit menjadi " + konversi.getCelciusToFarenheit());
        
        konversi.CelciusToReamur(suhu2);
        System.out.println("Suhu " + suhu2 + " derajat celcius dikonversi ke Reamur menjadi " + konversi.getCelciusToReamur());
        
        konversi.FahrenheitToReamur(suhu3);
        System.out.println("Suhu " + suhu3 + " derajat Fahrenheit dikonversi ke Reamur menjadi " + konversi.getFahrenheitToReamur());
    }
    
}
