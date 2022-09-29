/*solicitar al usuario un entero por teclado que va aser realmente un 
tipo string hay que convertirlo a tipo entero con los metodos*/
//hay que ver las clases String, pasar entero a String (String.value of(int))
package tipos;

import java.util.Scanner;


public class test {//conversion tipos
    public static void main(String[] args) {
         
            //instanciar una variable del clase Scanner
            Scanner lectura = new Scanner(System.in);  
            
            //soliciamos por teclado el numero entero
            System.out.println("Introduce el numero entero que quieres que muestre: ");
            
            //convierto el String a tipo entero
            int entero = Integer.parseInt(lectura.nextLine());
            
            //muestro el resultado por pantalla
            System.out.println("El entero que has tecleado es =  " + entero);
                       
            //for (i= 0 2: 10,/1)
    }
}
