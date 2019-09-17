/*
 * Ejemplo de Herencia/Polimorfismo
 */
package ejemploherencia;

/**
 *
 * @author Tuquina, Fernando Nahuel
 */
public class Docente extends Persona{
    private Categoria categoria;

    public Docente(Categoria categoria, String apellido, int documento) {
        super(apellido, documento);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + categoria;
    }
    
    
}
