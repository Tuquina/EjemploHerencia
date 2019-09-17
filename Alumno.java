/*
 * Ejemplo sobre Herencia
 */
package ejemploherencia;

import java.util.Objects;

/**
 *
 * @author Tuquina,Fernando Nahuel
 */
public class Alumno extends Persona{
    
    private String cx;

    public Alumno(String cx, String apellido, int documento) {
        super(apellido, documento);
        this.cx = cx;
    }

    @Override                       // Este método está "heredado" de Persona
    public String toString() {
        return super.toString() + "\n cx: " + cx;
    }
    
    @Override
    public void mostrar(){
        System.out.println("cx: "+ cx + "\t apellido: "+ getApellido());
        
        /*
            Nota: utilizo getApellido para mostrar el apellido y no super porque
                 únicamente voy a usar el super cuando en la clase padre haya el
                mismo método que en la subclase. En la clase Alumno no tengo un método
                getAlumno, no lo estoy sobreescribiendo, por lo que lo puedo usar de 
                manera directa.
        */
    }

      
    // Sobreescribir HashCode e equals a la vez!
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cx, other.cx)) {
            return false;
        }
        return true;
    }
    
    
     
}
