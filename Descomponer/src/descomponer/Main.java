
package descomponer;

import java.util.Scanner;

public class Main {
    
     public static void main(String[] args) {
     
    
     Scanner teclear = new Scanner(System.in);
     int numero;
     
     int quinto;
     int cuarto;
     int tercero;
     int segundo;
     int primero;
             
          System.out.print("Escribe un numero de 5 digitos: \n" );
        numero = teclear.nextInt();

       quinto = numero%10;

   

        numero = numero/10;
        cuarto = numero%10;

       

        numero = numero/10;
        tercero = numero%10;

 

        numero = numero/10;
        segundo = numero%10;
 

        numero = numero/10;
        primero = numero%10;

 

        System.out.printf("Los numeros separados son:");
        System.out.printf("%d  %d  %d  %d  %d  \n", primero, segundo, tercero, cuarto, quinto);

        System.out.printf("Ahora al reves: \n");
        System.out.printf("%d %d %d %d %d \n", quinto, cuarto, tercero, segundo, primero);
                
    }
}
     