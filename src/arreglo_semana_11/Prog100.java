
package arreglo_semana_11;

//Utilizando metodos , diseñe un programa que permita el 

import utils.Leer;

//ingreso de valores a un arreglo y los muestre
//Autor: Cristian Gamboa Condori

public class Prog100 {
    
    public static int[] num=new int[100];
    
    public static void numero(int arreglo[], int n){
        System.out.println("Digite un numero:");
        for(int i=0; i<n; i++){
            System.out.print((i+1)+".numero: ");
            arreglo[i] = Leer.entero();
        }
    }
    public static void mostrar(int arreglo[], int n){
        for (int i=0; i<n; i++) {
            System.out.println("Numero ["+(i+1)+"] "+arreglo[i]);
        }
    }
    
    public static void inicio(){
        int cant;
        System.out.println("Digite la cantidad de datos: ");
        cant = Leer.entero();
        numero(num, cant);
        mostrar(num, cant);
        
    }
    
    public static void main(String[] args) {
        inicio();
    }
    
    
}