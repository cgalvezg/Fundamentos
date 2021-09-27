
package Fundamentos;

import java.util.Scanner;


public class SentenciasControl {
    
    public static void main (String args[]){
        
        //Ejercicio para calcular la estacion del año
        Scanner consola = new Scanner(System.in);
        var mes = 0;        
        
        System.out.println("Introduce mes del año");
        mes = Integer.parseInt(consola.nextLine());
        
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }
        
        System.out.println("Estacion = " + estacion);
        
        
        //ejercicio con uso de switch, saber dia de la semana en string
        
        var dia = 0;
        var diaString = "No existe ese dia";
        
        System.out.println("Introduce numero del dia de la semana");
        dia = Integer.parseInt(consola.nextLine());
        switch (dia){
            case 1:
                diaString ="Lunes";
                break;
            case 2:
                diaString ="Martes";
                break;
            case 3:
                diaString ="Miercoles";
                break;
            case 4:
                diaString ="Jueves";
                break;  
            case 5:
                diaString ="Viernes";
                break;
            case 6:
                diaString ="Sabado";
                break;
            case 7:
                diaString ="Domingo";
                break;
        }
        System.out.println("El dia de la semana es " + diaString);        
             
                
                
        
        }
        
        
        
        
        
        
        
        
        
        
    }
    

