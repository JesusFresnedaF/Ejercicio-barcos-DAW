/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobarcos;

/**
 *
 * @author jesus
 */
public class EjercicioBarcos {

    
    public void inicio(){
        String alarma = "ALARMA";
        Crucero crucero = new Crucero();
        Pesquero pesquero = new Pesquero();
        Portaaviones portaaviones = new Portaaviones();
        crucero.alarma(alarma);
        crucero.mensajeSocorro();
        pesquero.alarma(alarma);
        pesquero.mensajeSocorro();
        portaaviones.alarma(alarma);
        portaaviones.mensajeSocorro();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        EjercicioBarcos m = new EjercicioBarcos();
        m.inicio();
    }
    
}
