
package fibonacci;

import java.util.Scanner;
       public class Main {

       public static int Fibo (int N){

          int x1=0,x2=1,actual=1,i;
           if (N==0||N==1)
          actual=1;

           else {
          for (i=2; i<=N;i++){
           actual=x1+x2;
           x1=x2;
           x2=actual;
         System.out.print("\n"+x2);
       }
    }
           return(actual);
 }
            public static void main(String[] args) {
                
             int n=0;
             int r=0;
           
            Scanner valor = new Scanner(System.in);
            
             System.out.print(" °°°FIBONACCI°°° ");
             System.out.print("\nPor favor Ingrese Numero:");
             
           n=valor.nextInt();
           r=Fibo(n);
           
             System.out.print("\nEl resultado es:"+r);
}
}
