/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobarcos;

/**
 *
 * @author jesus
 */
public class Portaaviones extends Barco{
    private int numAviones;
    private int numMarineros;

    public Portaaviones() {
        this.numAviones = 0;
        this.numMarineros = 0;
    }

    public Portaaviones(int numAviones, int numMarineros) {
        this.numAviones = numAviones;
        this.numMarineros = numMarineros;
    }

    public int getNum_aviones() {
        return numAviones;
    }

    public void setNum_aviones(int numAviones) {
        this.numAviones = numAviones;
    }

    public int getNum_marineros() {
        return numMarineros;
    }

    public void setNum_marineros(int numMarineros) {
        this.numMarineros = numMarineros;
    }

    @Override
    public String toString() {
        return "Portaaviones{" + "numero de aviones=" + numAviones + ", numero de marineros=" + numMarineros + '}';
    }
    
    @Override
    public void alarma(String alarma){
        System.out.print("Portaaviones: ");
        super.alarma(alarma);
    }
    @Override
    public void mensajeSocorro(){
        System.out.print("Portaaviones: ");
        super.mensajeSocorro();
    }
    
}
