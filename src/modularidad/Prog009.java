/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

//Autor: Cristian Gamboa Condori

public class Prog009 {
     //Metodos que devuelven valores
    public static String miuniversidad(){
        String universidad ="Universidad Nacional Tecnologica de Lima sur";
        return universidad;
    }
    
    public static void main(String[] args) {
        System.out.println(miuniversidad());
        System.out.println(miuniversidad().toUpperCase());
    }
}
