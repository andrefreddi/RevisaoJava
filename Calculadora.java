package Calculadora;

public class Calculadora {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor, insira dois numeros.");
        } else {
            float num1 = Integer.parseInt(args[0]);
            float num2 = Integer.parseInt(args[1]);

            System.out.println(num1 + num2);
            System.out.println(num1 * num2);
            System.out.println(num1 - num2);
            System.out.println(num1 / num2);

            if(num1 > num2){
                System.out.println(num1);
            } else {
                System.out.println(num2);
            }
        }
    }
}
