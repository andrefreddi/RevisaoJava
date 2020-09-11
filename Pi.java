package Pi;

public class Pi {

    public static void main(String[] args) {
        if (args.length != 1) {

            System.err.println("> Por favor, Digitar um numero: ");

        } else {

            double Numero_Acumulado = 0;
            float valor = Float.parseFloat(args[0]);
            float Calculo_de_PI = 0;
            float Numero_Trasicao;
            float Sinal = -1;
            float Numero_Diferenca = 0;
            float contador;

            if (valor % 2 == 0) {
                valor = valor -1;
            }

            for (contador = 3; contador <= valor; contador +=2) {
                Numero_Trasicao = (1 / 1 * Sinal);
                Numero_Acumulado = Numero_Acumulado + Numero_Trasicao;
                Sinal = Sinal * -1;
                Calculo_de_PI = (float) (4 * (1 + Numero_Acumulado));
                Numero_Diferenca = (float) ((double)(Math.PI) / (double)(Calculo_de_PI) - 1 );

            }


            System.out.println("> O Calculo de Pi = " + Calculo_de_PI);
            System.out.println("> Math.PI = " + Math.PI);
            System.out.println("> ERROR 404 = " + toPorcentage(Numero_Diferenca, 6));
        }
    }

    public static String toPorcentage(Float n, int digits) {return String.format("%.1" + digits + "f", n * 100) + "%";}
}
