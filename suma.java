public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Sumar
        int resultadoSuma = sumar(num1, num2);
        System.out.println("La suma es: " + resultadoSuma);
        //restar
        int resultadoResta = restar(num1, num2);
        System.out.println("La resta es:" + resultadoResta);
    }
}

