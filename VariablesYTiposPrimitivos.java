package Fundamentos;
import java.util.Scanner;



// Clase simple en Java
public class VariablesYTiposPrimitivos {
    
    //Funcion principal Main    
    public static void main(String args[]){
    
        
    //VARIABLES Y TIPOS PRIMITIVOS
        System.out.println("Hola mundo");
        
        //notacion Camel
        int miVariableEntera = 10;        
        System.out.println(miVariableEntera);
        String miVariableCadena = "Variable String";        
        System.out.println(miVariableCadena);        
        
        //Inferencia de tipos: asigna automaticamente variable int
        var miVariable = 15;
        System.out.println(miVariable);
        
        //Clase scanner (system.in), recibe lo que se escribe por consola        
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        
        //tipos primitivos enteros: byte, short, int, long
        //tipos primitivos flotantes: float, double
        
        
        //parseInt recibe String y convierte a int, por lo tanto edad es int
        var edad = Integer.parseInt("20");
        System.out.println("edad =" + (edad+1));
        
        //si la variable fuese string, concatenaria el 1
        var edadString = "20";
        System.out.println("edad =" + (edadString+1));
        
        //para convertir de int a String
        var edadTexto = String.valueOf(10);
        
        //extraer caracter de un String y convertirlo a int
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        
        
        
        
        
        
        
    
    }
    
}
