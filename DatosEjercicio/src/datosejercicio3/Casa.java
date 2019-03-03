
package datosejercicio3;



import java.util.Scanner;

public class Casa {

    private static String Valid = "Valido";
    private static String Invalid = "Invalido";
    private static String codigo = "[a-z][a-z][a-z][a-z][0-9][0-9][0-9][a-z][a-z][a-z][0-9][0-9][0-9]";
    
     public static void main(String[] args) {
    String str, resp;
    while (true){
        Scanner Leer = new Scanner(System.in);
            System.out.println("Por favor ingrese la recidencia en 4 letras 3 numeros 3 letras y 3 ");
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