/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpracticaobligatoria;
import java.util.Scanner;

/**
 *
 * @author casianamiranda
 */
public class ActividadPracticaObligatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su editor de código preferido");
        String codigo = entrada.nextLine();
        System.out.println("Ingrese su sistema operativo preferido");
        String sistema = entrada.nextLine();
        
        System.out.println("Bienvenidx " + nombre + apellido);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su editor de código preferido es: " + codigo);
        System.out.println("Su sistema operativo preferido es: " + sistema);

    }
    
}
