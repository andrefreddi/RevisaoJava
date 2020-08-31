package Populacao;

public class Populacao {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.err.println("Por favor, insira o ano que deseja verificar.");
        } else {
            int AnoDesejado = Integer.parseInt(args[0]); // ANO DESEJADO PARA CALCULO
            int AnoAtual = Integer.parseInt(args[1]); // ANO ATUAL (2020)

            int MediasSomas = AnoDesejado - AnoAtual;

            int PopulacaoAtual = Integer.parseInt(args[2]); // POPULACAO REFERENTE A 2020
            int AumentoDaPopulacao = Integer.parseInt(args[3]); // QUANTIDADE DE AUMENTO POR ANO

            int MediaDeAumento = MediasSomas * AumentoDaPopulacao;

            System.out.println(MediaDeAumento + PopulacaoAtual); // MOSTRA NA TELA A MEDIA DO AUMENTO + POPULACAO ATUAL


        }
    }
}
