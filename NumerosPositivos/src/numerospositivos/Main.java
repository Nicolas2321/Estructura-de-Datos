package numpositivos;

import java.io.*;
import java.util.Scanner;

public class Main {
    
                public static void main(String[] args)throws IOException {
                    
                int n,p;
                
                Scanner leer = new Scanner(System.in);
                
                    System.out.print("Por favor introduzca numero n:");
                    
                  
                     n =  leer.nextInt();
                          p=n;
                        while (p>=2){
                           p=p-2;
}
                              if (p==0) {
                  System.out.println("La suma de los numeros positivos pares de " + n + " es: " + sumapos(n));
}                 else{
                   System.out.println("El numero ingresado es impar");
}
}
                     static long sumapos (int n)
{
                       if (n<=2)
                       return 2;
                         else
{
                      long resultado = n+sumapos(n-2);
                         return resultado;
}
}
}
