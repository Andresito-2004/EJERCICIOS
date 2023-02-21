import java.util.Scanner;
public class Ejercicio1 {
    // Traer la liberia scanner

public static void main(String[] args) {
    // VARIABLES
    String  nombre;
    int edad = 0;
    String Tipo;
    int resulatdo;

    //Instaciar 
    Scanner Leer= new Scanner(System.in);
    //SOLICITAR DATOS 
System.out.println("Ingrese el nombre del animal: ");
nombre=Leer.nextLine();
System.out.println("Ingrese el tipo de animal: ");
Tipo=Leer.nextLine();
System.out.println("Ingrese la edad del animal: ");
edad=Leer.nextInt();
// OPERACIONES
resulatdo= edad * 50;

//MOSTRAR DATOS
System.out.println("El nombre es "+nombre+" su tipo es "+Tipo);

System.out.println("Su edad es "+edad+" Años"+" & su peso es "+resulatdo+"kg ");
    
Leer.close();
}
}

