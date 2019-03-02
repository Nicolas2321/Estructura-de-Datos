
package resultado;

import java.util.Scanner;

public class Main {

               public static void InvertirR(){
                int entrada;
                
                Scanner num= new Scanner (System.in);
                System.out.println("Ingrese el tamaño del arreglo:");
                     entrada=num.nextInt();
                     
                     
                  int arr []=new int [entrada];

                  for (int i=0;i<arr.length;i++){
                System.out.println("ingrese del vector:");
                  arr[i]=num.nextInt();
}
                    int inicio=0,fin=arr.length-1;

                  arr = InvierteRec(arr,inicio,fin);

                  for (int i=0;i<arr.length;i++){

                     if(i==0){
                    System.out.println("—–INVIRTIENDO—— ");
                    System.out.println("El vector invertido:");}
                    System.out.println(arr[i]);
}
}
                      public static int[] InvierteRec(int [] a,int i,int f){
                             while (i<=f){
                         int temp = a[f];
                           a[f] = a[i];
                          a[i] = temp;
                               return InvierteRec(a,i+1,f-1);
}
                               return  a;
}
                           public static void main(String[] args) {
                          InvertirR();
}
}
