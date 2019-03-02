
package arreglocalcula;



import java.util.Scanner;

public class Main {
    
          public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          
          int aux1;
          
             System.out.print("Por favor ingrese cantidad de numeros para el arreglo:");
                 int tamano = leer.nextInt();
                  int[] arreglo = new int[tamano];
               System.out.println("Ingrese los valores:");
                   for(int i = 0; i < tamano; i++) {
                   arreglo[i] = leer.nextInt();
}
                   for(int i = 0; i < tamano; i++) {
                      
                   for(int j = 0; j < tamano; j++) {
                       
                   if(arreglo[i] < arreglo[j]) {
                       
                     aux1 = arreglo[i];
                     
                     
                    arreglo[i] = arreglo[j];
                    
                    arreglo[j] = aux1;
}
}
}
                     for(int i = 0; i < tamano; i++) {
                         
                      System.out.print(arreglo[i] + " ");
}
}
}