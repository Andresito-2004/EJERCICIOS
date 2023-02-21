import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Declarar Variables      
        String Nombre;
        int llantas;
        int motor;
        int pintura;
        int latoneria;
        int total;
        
            //Instaciar 
            Scanner Leer= new Scanner(System.in);
            //SOLICITAR DATOS 
        System.out.println("Ingrese su nombre: ");
        Nombre=Leer.nextLine();
        System.out.println("Ingrese el valor del arreglo en llantas ($1500): ");
        llantas=Leer.nextInt();
        System.out.println("Ingrese el valor del arreglo en motor($2000): ");
        motor=Leer.nextInt();
        System.out.println("Ingrese el valor del arreglo en pintura($2500): ");
        pintura=Leer.nextInt();
        System.out.println("Ingrese el valor del arreglo en latoneria($3000): ");
        latoneria=Leer.nextInt();
        total=llantas+motor+pintura+latoneria;
        
        //MOSTRAR DATOS
        System.out.println("El nombre es "+Nombre);
        
        System.out.println("el valor del arreglo en llantas: "+llantas+
        " el valor del arreglo en motor: "+motor+
        " el valor del arreglo en pintura: "+pintura
        +" el valor del arreglo en latoneria: "+latoneria);
        System.out.println("Total del arreglo: "+total);
        
        Leer.close();
        }
}
