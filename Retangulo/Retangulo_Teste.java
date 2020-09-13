package Retangulo;

public class retanguloteste {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor digite um numero");
        } else {
            double primeironumero = Double.parseDouble(args[0]);
            double segundonumero = Double.parseDouble(args[1]);

            Retangulo retangulo = new Retangulo();
            try {
                retangulo.setComprimento(primeironumero);
                retangulo.setLarguta(segundonumero);
                System.out.println(retangulo.toString());
            } catch (erroretangulo erroretangulo) {
                System.out.println(erroretangulo.getMessage());
            }

        }
    }
}
