
package arreglo_semana_11;

//Diseñar un algoritmo q permite el ingreso de 7
//valores a un arreglo y mostrarlos
//Autor: Cristian Gamboa Condori

import utils.Leer;

public class Prog099 {
    
    public static void inicio(){
        int i;
        int[] a = new int[7];
        System.out.println("Tamaño del arreglo: "+a.length);
        System.out.println("Ingresar los elementos: ");
        for(i=0; i<a.length; i++){
            System.out.println("a["+i+"]: ");
            a[i] =Leer.entero();
        }
        System.out.println("LOs elementos del arreglo son: ");
        for(i=0; i<a.length; i++){
            System.out.println("a["+i+"]: "+a[i]);
        }
    }
    
    public static void main(String[] args) {
        inicio();
        
    }
}
