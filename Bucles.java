
package Fundamentos;


public class Bucles {
    public static void main (String args[]){
        
        //While, si la condicion es verdadera, entra
        
        var contador = 0;        
        while (contador < 5){
            System.out.println("contador = " + contador);
            contador ++;
        }
        
        //Do-While, entra siempre una vez al bucle, aunque la condicion sea falsa
        
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while (contador < 0);   
        
        
        
        //For, si la condicion es verdadera, entra, e incluye el contador        
        for (var i = 0; i < 5; i++){
            System.out.println("i = " + i);        
        }
        
        //break y continue        
        for (var i = 0; i < 5; i++){
            System.out.println("i = " + i);        
            if (i == 3) break;
        }
        
        for (var i = 0; i < 5; i++){                
            if (i == 3) continue;
            System.out.println("i = " + i);    
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
