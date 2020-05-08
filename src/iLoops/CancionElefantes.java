package iLoops;

public class CancionElefantes {

    public static void main(String[] args) {

        int numElefante = 0;
        String cancion1 = "elefante se columpiaba sobre la tela de una araña, como veia que resistia, fue a llamar a otro elefante";
        String cancion2 = "elefantes se columpiaban sobre la tela de una araña omo veian que resistia, fueron a llamar a otro elefante";

        for (numElefante = 1; numElefante <= 101; numElefante++) {

            while (numElefante ==1)
            {
                System.out.println(numElefante + " " + " " + cancion1);
                numElefante++;
            }
            if (numElefante <= 100)
            {
                System.out.println(numElefante + " " + " " + cancion2);
            } else
            {
                System.out.println("Se rompio la telaraña");
            }
        }
    }
}
