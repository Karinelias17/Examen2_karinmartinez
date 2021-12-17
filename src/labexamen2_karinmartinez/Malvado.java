
package labexamen2_karinmartinez;

import java.io.Serializable;

public class Malvado extends Carros implements Serializable{
    public String tipo;
    private static final long SerialVersionUID=777L;
    public Malvado() {
    }

    public Malvado(String tipo, String nombre, int vida, int ataque, int velocidad, int derrape) {
        super(nombre, vida, ataque, velocidad, derrape);
        this.tipo = tipo;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
