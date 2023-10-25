/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

public class KonversiSuhu2 extends KonversiSuhu {
    public float ftor;
    
    public void FahrenheitToReamur(float suhu3){
        this.ftor = (suhu3 - 32) * 4/9;
    }
    float getFahrenheitToReamur(){
        return ftor;
    }
}
