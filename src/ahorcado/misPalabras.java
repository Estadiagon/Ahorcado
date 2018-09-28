package ahorcado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class misPalabras {
    String unaPalabra;
    char letra[];
    String palabras[]={"alaska","balcon","calcio","parque"};
    void aleatorio(){
    int x=(int) (Math.random()*6);
    unaPalabra=palabras[x];
    }
    void descomponer(){
        letra=unaPalabra.toCharArray();
    }
}
