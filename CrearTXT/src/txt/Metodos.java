package txt;

import java.io.*;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class MetodosTXT {

	public String leer_tx(String direccion){

        String txt ="";  
        
        try{
                      BufferedReader bf = new BufferedReader(new FileReader(direccion));

                       String tem = " ";

                    String bfRead;

                   while ((bfRead = bf.readLine()) != null){

              tem = tem +bfRead;
          }
          txt = tem;
          
      }catch(IOException e){ 

          System.out.println("No se encontro archivo");
      }
        return txt;
    }
}
	

