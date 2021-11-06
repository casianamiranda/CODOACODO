package calculadora;

import java.util.Scanner;
import operaciones.Operaciones;

/**
 *
 * @author casianamiranda
 */
public class calculadora {
    
        public static void main(String [] args){
            Scanner entrada = new Scanner(Systema.in);
            System.out.printIn("Ingrese el primer número");
            float num = entrada.nextFloat();
            System.out.printIn("Ingrese el sgundo número");
            float num2 = entrada.nextFloat();
            System.out.printIn("Ingrese la operación a realizar");
            String op = entrada.next();
            Operaciones operacion = new Operaciones(num,num2,op);
            System.out.printIn("El resultado de la operacion es: \n") +
                operacion.operacion()
        }
    
}
