package Fatura;

public class FaturaProduto {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.err.println("> Por favor digitar o produto!");
        } else {
            String faturaProdut = args[0];
            String descricaoProdut = args[1];
            int quantidade = Integer.parseInt(args[2]);
            double valor = Double.parseDouble(args[3]);

            Fatura faturaCriada = new Fatura(faturaProdut, descricaoProdut, quantidade, valor);
            faturaCriada.totaldaFatura(quantidade,valor);
            System.out.println(faturaCriada.toString());
        }
    }
}
