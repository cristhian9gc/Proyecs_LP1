
package arreglo_semana_11;
import utils.Leer;

//Desarrollar un programa que permita el ingreso de valores
//aun arreglo y muestre la sumatoriade sus elementos.Utilizando metodos
public class Prog101 {
    
    public static int[] numeros = new int[100];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.print("digite los numeros al arreglo: ");
        for(int i=0; i<cantidad; i++){
            System.out.println("numeros["+i+"]: ");
            numeros[i] = Leer.entero();
        }
    }
    
    public static void sumatoria(){
        int suma=0;
        for (int i = 0; i < cantidad; i++) {
            suma+=numeros[i];
        }
        System.out.println("Resultado(Sumatoria): "+suma);
    }
    
    public static void inicio(){
        System.out.println("Cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        sumatoria();
    }
    
    public static void main(String[] args) {
        inicio();
        
    }
}
