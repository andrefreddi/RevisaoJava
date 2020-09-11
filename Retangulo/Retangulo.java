package Retangulo;


public class Retangulo{


    private double comprimento = 1;
    private double largura = 1;

    public Retangulo() {
    }

    public Retangulo(double comprimento_Informado, double Largura_Informada) {
        this.comprimento = comprimento_Informado;
        this.largura = Largura_Informada;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double getLarguta() {
        return this.largura;
    }

    public void setComprimento(double comprimento_Informado) throws Erro_Retangulo {
        if (comprimento_Informado > 0.0) {
            this.comprimento = comprimento_Informado;
        } else {
            throw new Erro_Retangulo();
        }
    }

    public void setLarguta(double Largura_Informada) throws Erro_Retangulo {
        if (Largura_Informada > 0.0) {
            this.largura = Largura_Informada;
        } else {
            throw new Erro_Retangulo();
        }
    }

    public double perimetro() {
        return 2 * (getComprimento() + getComprimento());
    }

    public double area() {
        return getComprimento() * getLarguta();
    }

    @Override
    public String toString() {
        return "Area: " + area() + "\nPerrimetro: " + perimetro();
    }
}