/*
 * Ejemplo de Herencia
 */
package ejemploherencia;

/**
 *
 * @author Tuquina Fernando Nahuel
 */
public class Persona {
    private String apellido;        // Si uso protected puedo hacer this.apellido desde una subclase (rompo el encapsulamiento)
    private int documento;

    public Persona(String apellido, int documento) {
        this.apellido = apellido;
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "["+documento+"] \t" + apellido;
    }
    
    public void mostrar(){
        System.out.println("["+documento+"] \t" + apellido.toUpperCase());
    }

    public String getApellido() {
        return apellido;
    }

    public int getDocumento() {
        return documento;
    }
    
    
    
}

