
package palindromo;

import java.util.Scanner;

public class Main {
                   public static void main(String[] args) {
              
                  Scanner leer = new Scanner(System.in);
                 
                  System.out.println("Por favor ingrese una palabra para verificar si en un Palindromo:");
                  String sPalabra = leer.nextLine();
                  
                       int inc = 0;
                    int des = sPalabra.length()-1;
                   boolean bError = false;

                  while ((inc<des) && (!bError)){

                if (sPalabra.charAt(inc)==sPalabra.charAt(des)){
                inc++;
                des--;
                  
                    } else {
                 bError = true;
}
}
                      if (!bError)
                   System.out.println(sPalabra + " es un PALINDROMO");
                  else
                    System.out.println(sPalabra + " NO es un palindromo");

}
}
