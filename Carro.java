package br.com.una.lista10.Dn;

public class Carro {
    String carro;
    String cor;
    int ano;
    double potencia;

    public Carro(String carro, String cor, int ano, double potencia) {
        this.carro = carro;
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "carro { " + carro +
                ", cor ='" + cor + '\'' +
                ", ano ='" + ano + '\'' +
                ", potencia =" + potencia +
                '}';
    }
    public  void acelerar () {
        System.out.println("Bih bihhh!! vamos, Bora dar uma volta.");
    }
}
