package Geometria;

public class Circulo extends Forma{

    protected  double raio;
    public Circulo(){ }
    public Circulo(double Raio_Informado) { this.raio = Raio_Informado; }

    public Circulo(double Raio_Informado, String Cor_Informado, boolean Preenchimento_Informado) {
        super(Cor_Informado, Preenchimento_Informado);
        this.raio = Raio_Informado;
    }

    public double getRaio()  { return this.raio; }
    public void setRaio(double Raio_Informado) { this.raio = Raio_Informado; }

    @Override
    public  double getArea(){
        return Math.PI + Math.pow(getRaio(), 2);

    }

    @Override
    public  double getPerimetro() { return 2 * Math.PI * getRaio(); }

    @Override
    public String toString(){
        return " > Circulo <  Raio = " + this.getRaio() + " / Cor = " + super.getCor() + " / Preenchimento = " + super.getPreenchimento() + " / Area = " + getArea() + " / Perimetro = " + getPerimetro();
    }

}
