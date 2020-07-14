
package vista;

import utils.Leer;

public class Principal {
     public static void factorial(){
        System.out.println("\tFactorial");
        System.out.print("Ingrese numero: ");
        int numero = Leer.entero();
        int fac=1;
        for (int i = 1; i <= numero; i++) {
            fac *=i;
        }
        System.out.println(numero + "! = "+ fac);
    }
    public static void mayoredad(){
        System.out.println("\tMayor de Edad");
        int edad;
        System.out.println("Edad: ");
        edad = Leer.entero();
        if(edad>=18){
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Menor de Edad");
        }
        
    }
    public static void parimpar(){
        System.out.println("\tPar o Impar");
        int numero;
        System.out.println("Numero: ");
        numero = Leer.entero();
        if(numero%2==0){
            System.out.println("Numero par");
        }else if(numero%2==1){
            System.out.println("Numero impar");
        }else{
            System.out.println("Numero Neutro");
        }
    }
    public static void primo(){
        System.out.println("\tNumero Primo");
        int numero, c=0;
        numero = Leer.entero();
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                c++;
            }
        }
        if( c==2 ){
            System.out.println("El número "+numero+" es primo");
        }else{
            System.out.println("El número "+numero+" no es primo");
        }        
    }
    public static void error(){
        System.out.println("Error opcion incorrecta");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos");
    }
    public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1. Factorial");
        System.out.println("2. Mayor de edad");
        System.out.println("3. Par Impar");
        System.out.println("4. Primo");
        System.out.println("5. salir");
        System.out.print("Ingrese la opcion[1-5] ");
        
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion =Leer.entero();
        
            switch(opcion){
                case 1: factorial();
                        break;
                case 2: mayoredad();
                        break;
                case 3: parimpar();
                        break;
                case 4: primo();
                        break;
                case 5: salir();
                        break;
                default: error();
            }
        }while(opcion!=5);
    }
    
    //metodo principal
    public static void main(String[] args) {
        inicio();
    }
}
