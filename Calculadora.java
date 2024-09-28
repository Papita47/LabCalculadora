public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int num1, int num2){
        
        return num1 * num2;

    }


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Sumar
        int resultadoSuma = sumar(num1, num2);
        System.out.println("La suma es: " + resultadoSuma);

        // Restar

        // Multiplicar
        System.out.println("El producto de los números es: " + multiplicar(num1,num2));

    }
}

