
package labexamen2_karinmartinez;

import java.io.Serializable;


public class Carros implements Serializable{
    public String nombre;
    public int vida, ataque, velocidad, derrape;

    private static final long SerialVersionUID=777L;
    public Carros() {
    }

    public Carros(String nombre, int vida, int ataque, int velocidad, int derrape) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.derrape = derrape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDerrape() {
        return derrape;
    }

    public void setDerrape(int derrape) {
        this.derrape = derrape;
    }
    
    
}
