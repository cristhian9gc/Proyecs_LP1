
package arreglo_semana_11;

//Utilizando metodos , diseñe un programa que permita el 

import utils.Leer;

//ingreso de valores a un arreglo y los muestre
//Autor: Cristian Gamboa Condori

public class Prog100 {
    
    public static void mostrar(int num[]){
        for(int i=0; i<5; i++){
            System.out.println("arreglo["+(i+1)+"]: "+num[i]);
        }
    }
    
    public static void main(String[] args) {
        int arreglo[] = {10,1,-5,60,1};
        System.out.println("LA cantidad e datos es: "+arreglo.length);
        
        mostrar(arreglo);
    }
    
}
