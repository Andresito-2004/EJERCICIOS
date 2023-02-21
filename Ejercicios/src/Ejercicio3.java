import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        //DECLARAR VARIABLES    
        int Num;
        int Multiplo;
        //INSTANCIAR
        Scanner Leer= new Scanner(System.in);
        //SOLICITAR DATOS 
    System.out.println("Ingrese un numero: ");
    Num=Leer.nextInt();
    Multiplo= Num%3;
    //MOSTRAR DATOS
    System.out.println(Multiplo==0 ? "el numero es multiplo de 3"
    : "el numero no es multiplo");
            Leer.close();
    }
}
