import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        //DECLARAR VARIABLES 
        String NomPro1; 
        int ValPro1 ;
        String NomPro2; 
        int ValPro2 ;        
        String NomPro3; 
        int ValPro3 ;
        String NomPro4; 
        int ValPro4 ;        
        String NomPro5; 
        int ValPro5 ;
        int total ;
        try (//INSTANCIAR
        Scanner Leer = new Scanner(System.in)) {
            //SOLICITAR DATOS 
   System.out.println("Ingrese el nombre del producto (1-5): ");
   NomPro1=Leer.nextLine();
   System.out.println("Ingrese el nombre del producto (2-5): ");
   NomPro2=Leer.nextLine();
   System.out.println("Ingrese el nombre del producto (3-5): ");
   NomPro3=Leer.nextLine();
   System.out.println("Ingrese el nombre del producto (4-5): ");
   NomPro4=Leer.nextLine();
   System.out.println("Ingrese el nombre del producto (5-5): ");
   NomPro5=Leer.nextLine();
   System.out.println("Ingrese el valor del producto (1-5): ");
   ValPro1=Leer.nextInt();
   System.out.println("Ingrese el valor del producto (2-5): ");
   ValPro2=Leer.nextInt();
   System.out.println("Ingrese el valor del producto (3-5): ");
   ValPro3=Leer.nextInt();
   System.out.println("Ingrese el valor del producto (4-5): ");
   ValPro4=Leer.nextInt();
   System.out.println("Ingrese el valor del producto (5-5): ");
   ValPro5=Leer.nextInt();
        }
        total= ValPro1+ValPro2+ValPro3+ValPro4+ValPro5;
    //MOSTRAR DATOS
    System.out.println("nombre del producto (1-5): "+NomPro1);
    System.out.println("nombre del producto (2-5): "+NomPro2);
    System.out.println("nombre del producto (3-5): "+NomPro3);
    System.out.println("nombre del producto (4-5): "+NomPro4);
    System.out.println("nombre del producto (5-5): "+NomPro5);
    System.out.println("Valor del producto (1-5): "+ValPro1);
    System.out.println("Valor del producto (2-5): "+ValPro2);
    System.out.println("Valor del producto (3-5): "+ValPro3);
    System.out.println("Valor del producto (4-5): "+ValPro4);
    System.out.println("Valor del producto (5-5): "+ValPro5);
    System.out.println("TOTAL: )"+total);

    }
    
}
