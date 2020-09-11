package Retangulo;

public class Retangulo_Teste {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor digite um numero");
        } else {
            double Primeiro_Numero = Double.parseDouble(args[0]);
            double Segundo_Numero = Double.parseDouble(args[1]);

            Retangulo retangulo = new Retangulo();
            try {
                retangulo.setComprimento(Primeiro_Numero);
                retangulo.setLarguta(Segundo_Numero);
                System.out.println(retangulo.toString());
            } catch (Erro_Retangulo erro_retangulo) {
                System.out.println(erro_retangulo.getMessage());
            }

        }
    }
}
