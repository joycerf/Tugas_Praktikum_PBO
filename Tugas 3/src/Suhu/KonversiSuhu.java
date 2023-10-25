/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

public class KonversiSuhu {
    public float ctof, ctor;
    
    public void CelciusToFahrenheit(float suhu1){
        this.ctof = (suhu1 * 9/5) + 32;
    }
    float getCelciusToFarenheit(){
        return ctof;
    }
    
    public void CelciusToReamur(float suhu2){
        this.ctor = suhu2 * 4/5;
    }
    float getCelciusToReamur(){
        return ctor;
    }
}
