package Suma;

import java.io.*;
import java.util.Scanner;

      public class Main {

            public static void main(String[] args)throws IOException {
                
            int n;
            
            Scanner leer = new Scanner(System.in);
            
               do{
                  System.out.print("Introduzca numero :");
                    n = leer.nextInt();
                 }while (n<0);
                  System.out.println("La suma de los numeros es:" + n + "=" + suma(n));
}
                  static long suma (int n)
{
                    if (n<=1)
                    return 1;
                    else
{
                     long resultado = n+suma(n-1);
                     
                       return resultado;
}
}
}