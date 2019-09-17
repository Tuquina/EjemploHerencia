/*
 * Ejemplo de Herencia
 */
package ejemploherencia;

import java.util.ArrayList;

/**
 *
 * @author Tuquina, Fernando Nahuel
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Mostramos los atributos de objetos con herencia
        
        Persona persona1 = new Persona("Perez", 16018989);
        System.out.println(persona1);
        persona1.mostrar();
        
        Alumno alumno1 = new Alumno("123", "Juarez", 26485399);
        Alumno alumno2 = new Alumno("123", "Juarez", 26485399);
        System.out.println(alumno1);
        alumno1.mostrar();
        
        /*
        Nota:
            Al escribir "alumno1. " los metodos mostrados en negrita son propios de su clase, el 
            resto de los métodos es heredado.
        */
        
        //Comparo dos objetos
        
        if(alumno1.equals(alumno1)){                // ANTES DE SOBREESCRIBIR equals()
            System.out.println("SON IGUALES");      //SON IGUALES
        }
        else{
            System.out.println("NO SON IGUALES");   
        }
        
        //--------------------------------------------//
        
        if(alumno1.equals(alumno2)){
            System.out.println("SON IGUALES");      // ANTES DE SOBREESCRIBIR equals()
        }
        else{
            System.out.println("NO SON IGUALES");   //NO SON IGUALES porque compara por direcciones de memoria
        }
        
        //-------------------------------------------//
        
        if(alumno1.equals(alumno1)){                //DESPUES DE SOBREESCRIBIR equals()
            System.out.println("SON IGUALES");      //SON IGUALES 
        }
        else{
            System.out.println("NO SON IGUALES");   
        }
        
        //Vamos a crear una arraylist para guardar Alumnos y Docentes
        
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        
        if(!listaPersonas.contains(alumno1)){
            listaPersonas.add(alumno1);
        }
        
        if(!listaPersonas.contains(alumno1)){       //En este caso ya no lo agrega
            listaPersonas.add(alumno1);
        }
        
        for(Persona per: listaPersonas){
            System.out.println(per);
        }
        
    }
    
}
