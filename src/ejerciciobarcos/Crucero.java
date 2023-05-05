/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobarcos;

/**
 *
 * @author jesus
 */
public class Crucero extends Barco{
    private float eslora;
    private int camasOcupadas;
    
    public Crucero(){
        this.eslora = 0;
        this.camasOcupadas = 0;
    }
    
    public Crucero(float slora, int camasOcupadas){
        this.eslora = slora;
        this.camasOcupadas = camasOcupadas;
    }

    public float getSlora() {
        return eslora;
    }

    public void setSlora(float slora) {
        this.eslora = slora;
    }

    public int getCamasOcupadas() {
        return camasOcupadas;
    }

    public void setCamasOcupadas(int camasOcupadas) {
        this.camasOcupadas = camasOcupadas;
    }

    @Override
    public String toString() {
        return "Crucero{" + "slora=" + eslora + ", camasOcupadas=" + camasOcupadas + '}';
    }
    
    @Override
    public void alarma(String alarma){
        System.out.print("Crucero:");
        super.alarma(alarma);
    }
    @Override
    public void mensajeSocorro(){
        System.out.print("Crucero:");
        super.mensajeSocorro();
    }
}
