import java.util.Scanner;

public class Dividir {
    
    public static int division(int a, int b) {
        int  resultado = a / b;

        return resultado;
    }


    public static void main(String[] args) {
        Scanner  ingresar = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = ingresar.nextInt();
        System.out.println("ingrese el segundo numero" );
        int num2 = ingresar.nextInt();
        ingresar.close();
        int resultadoDivi = division(num1, num2);
        System.out.println("El resultado es : " + resultadoDivi);
    }
}
