package Geometria;
 public class Teste{
     public static void main(String [] args) {

         if ( args.length != 4) {
             System.err.println("Digite 4 numeros");
         } else {
             double Primeiro_Numero = Double.parseDouble(args[0]);
             double Segundo_Numero = Double.parseDouble(args[1]);
             double Terceiro_Numero = Double.parseDouble(args[2]);
             double Quarto_Numero = Double.parseDouble(args[3]);

             Circulo circulo = new Circulo(Primeiro_Numero);
             Retangulo retangulo = new Retangulo(Segundo_Numero, Terceiro_Numero);
             Quadrado quadrado = new Quadrado(Quarto_Numero, Quarto_Numero);

             System.out.println(circulo.toString());
             System.out.println(retangulo.toString());
             System.out.println(quadrado.toString());
         }
     }
 }
