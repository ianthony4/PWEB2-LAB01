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
            case 3:
                System.out.println(mul(a, b));
            break;
            case 4:
                System.out.println(div(a, b));
            break;
            case 5:
                System.out.println(mod(a, b));
            break;
            
        }
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }
    
    public static int mul(int a,int b){
        return a*b;
    }

    public static double div(int a,int b){
        return a/b;
    }

    public static int mod(int a,int b){
        return a%b;
    }
}
