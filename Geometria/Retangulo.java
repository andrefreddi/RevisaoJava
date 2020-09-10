package Geometria;

public class Retangulo extends Forma {
    protected double base;
    protected double altura;

public Retangulo() { }

public Retangulo(double Base_Informada, double Altura_Informada) {
    this.base = Base_Informada;
    this.altura = Altura_Informada;
}

public Retangulo(double Base_Informada, double Altura_Informada, String Cor_Informada, boolean Preenchimento_Informado){
    super(Cor_Informada, Preenchimento_Informado);
    this.base = Base_Informada;
    this.altura = Altura_Informada;
}

public double getBase() { return  this.base; }
public void setBase(double Base_Informada) {this.base = Base_Informada; }

public  double getAltura() {return this.altura; }
public void setAltura(double Altura_Informada) {this.altura = Altura_Informada; }

@Override
    public double getArea() { return getBase() * getAltura(); }

@Override
    public double getPerimetro() { return 2 * ( getBase() + getAltura()); }

@Override
    public  String toString(){
    return " > Retangulo < Base = " + this.getBase() + " / Altura = " + this.getAltura() + " / Cor = " + super.getCor() + " / Preenchimento = " + super.getPreenchimento() + " / Area = " + this.getArea() + " / Perimetro = " + this.getPerimetro();
}
}