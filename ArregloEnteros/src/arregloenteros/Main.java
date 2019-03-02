
package arregloenteros;
import java.util.Scanner;

public class Main {
    
          public static void main(String[] args) {
              
          Scanner read = new Scanner(System.in);
          int a1 = 0;
          
          System.out.print("Por favor ingrese cantidad de numeros para el arreglo:");
          int tamano = read.nextInt();
          
               int[] arreglo = new int[tamano];
          System.out.println("Por favor ingrese los valores:");
          
                   for(int i = 0; i < tamano; i++) {
                   arreglo[i] = read.nextInt();
}
                   for(int i = 0; i < tamano; i++) {
                   for(int j = 0; j < tamano; j++) {
                   if(arreglo[i] < arreglo[j]) {
                   a1 = arreglo[i];
                   arreglo[i] = arreglo[j];
                   arreglo[j] = a1;
}
}
}
                     for(int i = 0; i < tamano; i++) {
                  System.out.print(arreglo[i] + " ");
}
}
}
