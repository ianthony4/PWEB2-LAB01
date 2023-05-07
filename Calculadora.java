package Lab01a;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = sc.nextInt();
        System.out.print("Elija una operacion\n1 -> Suma\n2 -> Resta\n3 -> Multiplicacion\n4 -> Division\n5 -> Modulo\nEleccion: ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.println(add(a, b));
            break;
            case 2:
                System.out.println(sub(a, b));
            break;
            //case 3 : multiplicacion
            //case 4 : division
            //case 5 : modulo

        }
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }
    
    //func. Mul
    //func. Div
    //func. Mod
}
