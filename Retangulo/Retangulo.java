package Retangulo;


public class Retangulo{


    private double comprimento = 1;
    private double largura = 1;

    public Retangulo() {
    }

    public Retangulo(double comprimentoinformado, double Largura_Informada) {
        this.comprimento = comprimentoinformado;
        this.largura = Largura_Informada;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double getLarguta() {
        return this.largura;
    }

    public void setComprimento(double comprimentoinformado) throws erroretangulo {
        if (comprimentoinformado > 0.0) {
            this.comprimento = comprimentoinformado;
        } else {
            throw new erroretangulo();
        }
    }

    public void setLarguta(double largurainformada) throws erroretangulo {
        if (largurainformada > 0.0) {
            this.largura = largurainformada;
        } else {
            throw new erroretangulo();
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
        return "Area: " + area() + "\nPerimetro: " + perimetro();
    }
}
