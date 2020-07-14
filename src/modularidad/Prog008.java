
package modularidad;

//Autor: Cristian Gamboa Condori

public class Prog008 {
    //metodos que reciben parametros
    public static void saludo(String nombre){
        System.out.println("Bienvenido "+ nombre);
        System.out.println("Disfruta tu estadia en este lugar");
    }
    public static void saludo2(String nombre, String carrera){
        System.out.println(nombre+" Disfruta tu estadia en la carrera de "+ carrera);
    }
    public static void factorial(int num){
        int fact =1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println("Factorial de "+num+" es: "+ fact);
    }
    
    public static void main(String[] args) {
        saludo("Cristian");
        saludo2("Pamela Greta", "Ing. Sistemas");
        factorial(5);
    }
}
