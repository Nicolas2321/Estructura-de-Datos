
package arreglomc;

import java.io.*;
import java.util.Scanner;

public class Main {
    
    
              public static void main(String[] args)throws IOException {
                  
                    int o,p,x,m;
                    
                  Scanner read = new Scanner(System.in);
                   System.out.print("Por favor introduzca primer numero:");
                   
                    m = read.nextInt();
                    p=m;
                    System.out.print("Por favor introduzca segundo numero:");
                    o =  read.nextInt();
                    
                    x=o;
                    System.out.println("El MCD de M Y N ES:"+sacar_mcd(o, m % o));
                    
}
                           public static int sacar_mcd(int m, int n) {
                               
                           if(n==0)
                               
                           return m;
                           else
                           return sacar_mcd(n, m % n);
}
}