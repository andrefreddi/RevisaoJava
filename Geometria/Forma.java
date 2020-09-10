package Geometria;
public abstract  class Forma {

    protected String cor = "Vermelho";
    protected boolean preenchido = true;

public  Forma() { }

public Forma(String Cor_Informada, boolean Preenchimento_Informado){
    this.cor = Cor_Informada;
    this.preenchido = Preenchimento_Informado;
}

public String getCor() { return  this.cor; }
public void setCor(String Cor_Informada) { this.cor = Cor_Informada;}

public boolean getPreenchimento() { return  this.preenchido; }
public void  setPreenchido( boolean Preenchimento_Informado) { this.preenchido = Preenchimento_Informado; }

public abstract double getArea();
public abstract double getPerimetro();
public abstract String toString();
}