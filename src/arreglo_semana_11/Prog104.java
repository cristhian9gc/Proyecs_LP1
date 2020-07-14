
package arreglo_semana_11;
import utils.Leer;
//Eliminar elementos de un arreglo

public class Prog104 {
    
    public static int[] numeros = new int[100];
    public static int cantidad;
    
    public static void dato(){
        System.out.println("Digite los datos: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        }
    }
    
    public static void eliminar(){
        int n;
        System.out.println("Digte la posiciona eliminar: ");
        n = Leer.entero();
        
        for (int i = 0; i < cantidad; i++) {
            if(i==n){
                while(i<cantidad){
                    numeros[i]=numeros[i+1];
                    i++;
                }
                break;
            }
        }
        
        cantidad = cantidad-1;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
            
        }
    }
    
    public static void inicio(){
        System.out.print("Digite la cantidad de datos del arreglo: ");
        cantidad =Leer.entero();
        dato();
        eliminar();
    }
    
    public static void main(String[] args) {
        inicio();
    }
}
