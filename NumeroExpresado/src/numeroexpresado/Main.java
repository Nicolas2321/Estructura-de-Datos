
package numeroexpresado;


import java.util.Scanner;

public class Main {
    
    
                     public static void main(String[] args) {
                         
                     Scanner numero = new Scanner(System.in);
                     
                     System.out.print("Por favor ingresa un numero en codigo Binario:");
                     
                        int n = numero.nextInt();
                        
                        int ex=-1;
                        
                     System.out.print("El codigo binario " + n + " convertido a entero es:" +entero(n,ex));
}
                       public static int entero(long val,int ex){
                           ex++;
                          if(val==0){
                            return 0;}
         return (int)(((val % 10) * Math.pow(2,ex)) + entero(((val - (val % 10)) / 10),ex));
}
}