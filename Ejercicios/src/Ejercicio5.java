import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //DECLARAR VARIABLES 
        int ide; 
        String nom;
        int spantalla ;        
        int storre ;
        int numpequipo; 
        int steclado ;        
        int smouse ;
        String Observaciones ;

        Scanner Leer = new Scanner(System.in) ;
            //SOLICITAR DATOS
    System.out.println("Ingrese su nombre: ");
    nom=Leer.nextLine();
    System.out.println("Ingrese las observaciones: ");
    Observaciones=Leer.nextLine();
    System.out.println("Ingrese su identificación: ");
    ide=Leer.nextInt();
    System.out.println("Ingrese el serial de la pantalla: ");
    spantalla=Leer.nextInt();
    System.out.println("Ingrese el serial de la torre: ");
    storre=Leer.nextInt();
    System.out.println("Ingrese el numero de equipo ");
    numpequipo=Leer.nextInt();
    System.out.println("Ingrese el serial del teclado: ");
    steclado=Leer.nextInt();
    System.out.println("Ingrese el serial del mouse: ");
    smouse=Leer.nextInt();
   
    System.out.println("Nombre: "+nom);
    System.out.println("Observaciones: "+Observaciones);
    System.out.println("Su identificación: "+ide);
    System.out.println("serial de la pantalla: "+spantalla);
    System.out.println("serial de la torre: "+storre);
    System.out.println("numero de equipo: "+numpequipo);
    System.out.println("serial del teclado: "+steclado);
    System.out.println("Ingrese el serial del mouse: "+smouse);
    Leer.close();

    }
    
}
