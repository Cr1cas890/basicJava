package aPseudocodigo.cPseudoCodigoCiclos;

public class Sandwiches {
    public static void main(String[] args) {

        int sandwichJamon = 0;
        int sandwichBolonia = 10;

        while (sandwichJamon <5){
            sandwichJamon++;
            System.out.println("Jamon " + sandwichJamon);
        }
        System.out.println("");

        while (sandwichBolonia > 0) {
            sandwichBolonia--;
            System.out.println("Bolonia " + sandwichBolonia);
        }
        System.out.println("");
        System.out.println("Soy el campeón");

    }

}
