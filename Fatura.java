package Fatura;

public class Fatura {
    public static void main(String[] args) {
        String descricao;
        String codigo;
        int quantidade;
        float valor;
        float total;

        // Produtos

        descricao = new String("Queijo cheddar");
        codigo = new String("105");
        quantidade = 2;
        valor = 12;


        // Print produtos

        System.out.println(" > Descricao do produto: " + descricao);
        System.out.println(" > Codigo do produto: " + codigo);
        System.out.println(" > Valor  do produto: " + valor);
        System.out.println(" > Quantidade do produto: " + quantidade);
        System.out.println(" > Valor total da compra: " + quantidade * valor);

        }
    }
