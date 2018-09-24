
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */

public class Palabra {
    
    String p;
    String Adivinanza;
    int contador;
    char letras[];
    String palabras[]={"PROGRAMAR","ORIENTADA","OBJETOS","AVANZADA"};
    
    void seleccionar(){
    Random miRandom = new Random();
    int azar = miRandom.nextInt(15);
    palabras[azar]= Adivinanza;
   System.out.println(Adivinanza);
    }
    
    void dividir(){
        contador=Adivinanza.length();
    }
   
     
}
