import java.util.Scanner;

public class Dividir {
    
    
    static int resultadofinal;
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int division(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = ingresar.nextInt();
        System.out.println("ingrese el segundo numero" );
        int num2 = ingresar.nextInt();
        System.out.println("ingrese la operacion que desea realizar" );
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        int operacion  =  ingresar.nextInt();
        while (operacion != 0) {
            
        
        switch (operacion) {
            case 1:
            int resultadoS = suma(num1, num2);
            int resultadofinal = resultadoS;
                break;
            case 2:
            int resultadoR = resta(num1, num2);
            int resultadofinal = resultadoR;
                break;
            case 3:
            int resultadoM = multiplicacion(num1, num2);
            int resultadofinal = resultadoM;
                break;
            case 4:
            int resultadoD = division(num1, num2);
            int resultadofinal = resultadoD;
                break;
            default:
                break;
        }
    }
        System.out.println("El resultado es : " + resultadofinal);
        ingresar.close();
    }
}
