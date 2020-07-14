
package arreglo_semana_11;

import utils.Leer;
//Desarrollar un programa que permita el ingreso de los valores a un
//arreglo y muestre el factorial de cada elemento.Utilize metodos

public class Prog102 {
    
    public static int[] numeros = new int[100];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for(int i=0; i<cantidad; i++){
            System.out.println("numeros["+i+"]: ");
            numeros[i] = Leer.entero();
        }
    }
    
    public static int factorial(int numero){
        int fac =1;
        for(int i=1; i<=numero; i++){
            fac*=i;
        }
        return fac;
    }
    
    public static void imprimirfactorial(){
        System.out.println("Resultado: ");
        for(int i=0; i<cantidad; i++){
            System.out.println(numeros[i]+": "+factorial(numeros[i]));
        }
    }
    
    public static void inicio(){
        System.out.println("Cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        factorial(cantidad);
        imprimirfactorial();
    }
    public static void main(String[] args) {
        inicio();
    }
}
