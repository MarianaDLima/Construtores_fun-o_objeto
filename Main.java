package br.com.una.lista10.Dn;

public class Main {
    public static void main(String[] args) {

        Animal animal2 = new Animal(
                 "Toto","poodle",5,10.2 );

        Carro car = new Carro("Camaro","amarelo",2018,5.0 );

        System.out.println(animal2);
        animal2.falarToto();
        animal2.latir();
        System.out.println("\n");
        System.out.println(car);
        car.acelerar();


    }
}
