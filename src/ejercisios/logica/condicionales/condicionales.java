package ejercisios.logica.condicionales;


import java.util.Scanner;

public class condicionales {
    
    public static void main(String[] args){
        
        double a = 10;
        double b = 8;
        
        double resta = a - b;
        
        //condicional if
        
        if(resta < 0){
            
            System.out.println("el numero es negativo y su resultado es: "+resta);
              
        }else if( resta == 0 ){
        
            System.out.println("elresultado es: "+resta);
            
        }
        else{
        
            System.out.println("el numero es positivo y su resultado es: "+resta);
            
        }
        
        //codicional switch
        
        
        //del 1 al 12 que mes es
        
        int op = 12;
        
        switch(op){
            
            case 1:
                
                System.out.println("Enero");
                break;
                
            case 2:
                
                System.out.println("Febrero");
                break;
                
            case 3:
                
                System.out.println("Marzo");
                break;
                
            case 4:
                
                System.out.println("Abril");
                break;
                
            case 5:
                
                System.out.println("Mayo");
                break;
                
            case 6:
                
                System.out.println("Junio");
                break;
                
            case 7:
                
                System.out.println("Julio");
                break;
                
            case 8:
                
                System.out.println("Agosto");
                break;
            case 9:
                
                System.out.println("Septiebre");
                break;
                
            case 10:
                
                System.out.println("Octubre");
                break;
                
            case 11:
                
                System.out.println("Noviembre");
                break;
                
            case 12:
                
                System.out.println("Diciembre");
                break;
                
            default:
                
                System.out.println("Opcion invalida");
                break;
                
        }
        
        
        // Ciclos repetitivos
        
        int limite = 10;
        int numero = 5;
        
        //ciclo for
        
        for(int i = 0 ; i <= limite ; i++){
            
            System.out.println(numero + "*" + i + "=" + i*numero);
            
        }
        
        // ciclo while
        
        int j = 0;
        
        System.out.println("Ciclo while");
        
        while(j <= 10){
            
            System.out.println(numero + "*" + j + "=" + j*numero);
            j = j + 2;
            
        }
        
        
        //for con if y break
        
        System.out.println("for con if y break");
        
        for(int i = 0 ; i <= limite ; i++){
            
            if(numero > 5){
                break;
            }
            
            System.out.println(numero + "*" + i + "=" + i*numero);
            
        }
        
        // SCANNER
        
        System.out.println("\nScanner");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nIngrese Nombre: ");
        String texto = teclado.nextLine();
        System.out.print("\nIngrese Edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("Hola "+ texto + " su edad es => "+edad);
        
        
    }
    
}
