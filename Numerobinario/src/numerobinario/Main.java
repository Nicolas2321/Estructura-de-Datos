
package numerobinario;

import java.io.*;
import java.util.Scanner;


public class Main {
    
                      public static String Numeroabinario(int num)
{
                     if (num / 2 != 1)
                         
                     return Numeroabinario(num / 2) + num % 2;
                     
                      else
                     return "1" + num%2;
                     
}
                              public static void main(int[] arr,int pos) {
                                  
                              if (pos < arr.length / 2) {
                              int tmp =  arr[pos];
                              arr[pos] =  arr[arr.length - pos -1];
                                arr[arr.length - pos -1] = tmp;
                                    main(arr, pos + 1);
}
}
                           public static void main(String args[])throws IOException
{
                            int num;
                             Scanner leer = new Scanner(System.in);
                             
                             System.out.print("Por favor introduzca un numero:");
                             
                             num = leer.nextInt();
                             
                             System.out.println("El numero es " + num + "  y se a convertido a binario es: " + Numeroabinario(num));
}
}
