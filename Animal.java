package br.com.una.lista10.Dn;

public class Animal {
    String nome;
    String raca;
    int idade;
    double peso;

    public Animal(String nome, String raca, int idade, double peso){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
    public Animal(){

    }
    public String getNome(){
        return nome;
    }
    public String getRaca(){
        return raca;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Animal {" +
                "nome ='" + nome + '\'' +
                ", raça ='" + raca + '\'' +
                ", idade ='" + idade + '\'' +
                ", peso =" + peso +
                '}';
    }
    public void latir(){
        System.out.println("au! auu!");
    }
    public void falarToto(){
        System.out.println("La vem o "+ this.nome + "...");
    }
}
