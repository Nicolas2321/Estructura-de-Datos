package Datos;

import java.util.Scanner;


public class DatosEjercicio {

    private static String Valid = "Valido";
    private static String Invalid = "Invalido";
    private static String codigo = "[a-z][a-z][a-z][0-9][0-9][0-9]";
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
    String str, resp;
        while (true){
            System.out.println("Por favor ingrese el numero de placa");
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
