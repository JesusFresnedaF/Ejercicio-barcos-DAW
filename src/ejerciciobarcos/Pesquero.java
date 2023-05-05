/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobarcos;

/**
 *
 * @author jesus
 */
public class Pesquero extends Barco {
    private float eslora;
    private float potencia;
    private int numeroPescadores;
    
    public Pesquero(){
        this.eslora = 0;
        this.potencia = 0;
        this.numeroPescadores = 0;
    }

    public Pesquero(float slora, float potencia, int numeroPescadores) {
        this.eslora = slora;
        this.potencia = potencia;
        this.numeroPescadores = numeroPescadores;
    }

    public float getSlora() {
        return eslora;
    }

    public void setSlora(float slora) {
        this.eslora = slora;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPescadores() {
        return numeroPescadores;
    }

    public void setNumeroPescadores(int numeroPescadores) {
        this.numeroPescadores = numeroPescadores;
    }

    @Override
    public String toString() {
        return "Pesquero{" + "slora=" + eslora + ", potencia=" + potencia + ", numeroPescadores=" + numeroPescadores + '}';
    }

    @Override
    public void mensajeSocorro() {
        System.out.print("Pesquero: ");
        super.mensajeSocorro();
    }

    @Override
    public void alarma(String alarma) {
        System.out.print("Pesquero: ");
        super.alarma(alarma);
    }
    
    
}
