package formasdiferentes;

      import java.io.*;
import java.util.Scanner;

         public class Main {
             
          public static void main(String[] args) throws IOException{
              
              Scanner leer = new Scanner(System.in);
             int r;
             int n;
             int resta,c=0;
          

              System.out.print(" \n Por favor introduzca el primer numero : ");
              r = leer.nextInt();
              System.out.print(" \n Por favor introduzca el Segundo numero : ");
              n = leer.nextInt();
                   if(n>r){
                  resta=(n-r);
                  c = (int) (factorial(n) * factorial(r) * factorial(n - r));

              System.out.println("\n \t" + n + "!=" + factorial(n));
              System.out.println("\n \t" + r + "!=" + factorial(r));
              System.out.println("\n \t" + resta + "!=" + factorial(resta));
                 System.out.println(c);
           }
                   else{System.out.print("Error de ingreso de datos,r tiene que ser menor que el primer numero");}
             }
               static long factorial (int r)
                      {
                  if (r<=1)
                   return 1;
                else
                        {
                        long resultado = r*factorial(r-1);
                                 return resultado;
}
}
}