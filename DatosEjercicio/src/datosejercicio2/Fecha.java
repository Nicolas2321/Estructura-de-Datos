
package datosejercicio2;

import java.util.Scanner;


public class Fecha {

    private static String Valid = "Valido";
    private static String Invalid = "Invalido";
    private static String codigo = "[0-3][0-9][0-1][0-9][0-9][0-9][0-9][0-9]";
    
    public static void main(String[] args) {
    String str, resp;
    while (true){
        Scanner Leer = new Scanner(System.in);
            System.out.println("Por favor ingrese la fecha en Año/mes/dia");
            str = Leer.nextLine();
            
            if (str.matches(codigo)) {
                resp = Valid;
            }else{
                resp = Invalid;
            }
            
            System.out.println( str+ "\n" + resp);
        }
    }
}