package Fatura;

public class Fatura {

        String codigo;
        String descricao;
        int quantidade;
        double valor;

        public  Fatura(String codigoInfo, String descricaoInfo, int quantidadeInfo, double valorInfo){
            this.codigo = codigoInfo;
            this.descricao = descricaoInfo;
            this.quantidade = quantidadeInfo;
            this.valor = valorInfo;
        }

        public double totaldaFatura(int quantidadeInfo, double valorInfo){
            return (double) quantidadeInfo * valorInfo;
        }

        @Override
        public String toString(){
            return "> Codigo: " + this.codigo + "\n> Descricao: " + this.descricao + "\n> Quantidade: " + this.quantidade + "\n> Valor: R$: " + this.valor + " Reais" + "\n> Total da Fatura: R$: " + this.totaldaFatura(this.quantidade,this.valor) + " Reais";
        }


    }

