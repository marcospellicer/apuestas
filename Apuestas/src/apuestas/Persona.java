/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

/**
 *
 * @author alumno
 */
public class Persona {
    private String nombre;
    private int golL;
    private int golV;
    private boolean pagado;

    public Persona(String nombre, int golL, int golV, boolean pagado) {
        this.nombre = nombre;
        this.golL = golL;
        this.golV = golV;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return   getNombre() + " --> Local " + getGolL() + " - " + getGolV() + " Visitante " + "     Pagado : "+isPagado();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the golL
     */
    public int getGolL() {
        return golL;
    }

    /**
     * @param golL the golL to set
     */
    public void setGolL(int golL) {
        this.golL = golL;
    }

    /**
     * @return the golV
     */
    public int getGolV() {
        return golV;
    }

    /**
     * @param golV the golV to set
     */
    public void setGolV(int golV) {
        this.golV = golV;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
}
