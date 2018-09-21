/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Palabras {
    String p;
    char letras[];
    String palabras[]={"COSA","CASO","CASA","ALVR"};
    void seleccionar(){
    int x=(int) (Math.random()*4);
    p=palabras[x];
    }
    void dividir(){
        letras=p.toCharArray();
    }
}
