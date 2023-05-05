/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobarcos;

/**
 *
 * @author jesus
 */
public abstract class Barco {
    public void alarma(String alarma){
        System.out.println(alarma);
    }
    
    public void mensajeSocorro(){
        System.out.println("S.O.S");
    }
}
