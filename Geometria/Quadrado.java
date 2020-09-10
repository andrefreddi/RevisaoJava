package Geometria;

public class Quadrado extends Forma {

    protected double base;
    protected double altura;

    public Quadrado() { }

    public Quadrado(double Base_Informada, double Altura_Informada) {
        this.base = Base_Informada;
        this.altura = Altura_Informada;

    }

    public Quadrado(double Base_Informada, double Altura_Informada, String Cor_Informada, boolean Preenchimento_Informado){
        super(Cor_Informada, Preenchimento_Informado);
        this.base = Base_Informada;
        this.altura = Altura_Informada;
    }

    public double getBase() { return  this.base; }
    public void setBase(double Base_Informada) {this.base = Base_Informada; }

    public  double getAltura() {return this.altura; }
    public void setAltura(double Altura_Informada) {this.altura = Altura_Informada; }

    @Override
    public double getArea() { return 4 * getBase(); }

    @Override
    public double getPerimetro() { return getAltura() * getAltura(); }

    @Override
    public  String toString(){
        return " > Quadrado < Área Quadrado = " + this.getPerimetro() + " / Perímetro Quadrado = " + this.getArea();
    }
}