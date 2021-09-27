package Fundamentos;

public class Operadores {
    
        public static void main (String args[]){
        
            int a=3, b=2;
            
            //otros operadores: *, /, +, % ....
            var resultado = a + b;           
            System.out.println("resultado suma = " + resultado);
            
            //comprobamos si el numero es par/impar
            if (a % 2 ==0)
                System.out.println("Numero par");
            else
                System.out.println("Numero impar");
            
            //b = b + 1;
            b +=1;
            System.out.println(b);
            
            //cambiamos el signo
            a= -b;
            System.out.println(a);
            
            //incrementos (pre y post)
            var e = 2;
            var f = e++;            
            System.out.println(e);
            System.out.println(f);
            f = --e;
            System.out.println(f);
            
            
            //igualdad y relacionales            
           var c = (a == b);
           var d = (a != b);
           System.out.println(c);
           System.out.println(d);           
           var cadena1 = "hola";
           var cadena2 = "adios";
           var h = cadena1.equals(cadena2);  
           System.out.println(h);
           
           //condicionales
           a = 10;           
           var resultado2 = a >= 0 && a <= 10;
           System.out.println("resultado = " + resultado2);           
           if (resultado2) System.out.println("Dentro de rango");
           else System.out.println("Fuera de rango");
           
           
           //operador ternario, despes de ? se ejecuta lo true, despues de : se ejecuta lo false
           var ternario = (3 > 2) ?"verdadero" :"falso" ;
            System.out.println("ternario = " + ternario);
            
            
            //precedencia operadores
            var precedencia = 4 + 5 * 6 / 3; // 4 + ((5*6)/3)
            
           
           
        
            
        
        }
    
}
