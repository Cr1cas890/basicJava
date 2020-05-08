package iLoops;

public class CancionElefantes {

    public static void main(String[] args) {

        int numElefante = 0;

        for (numElefante = 1; numElefante <=100; numElefante++){
            if (numElefante == 1){
                System.out.println(numElefante + " elefante se columpiaba sobre la tela de una araña, " +
                        "como veia que resistia, fue a llamar a otro elefante");
            }else System.out.println(numElefante + " elefantes se columpiaban sobre la tela de una araña," +
                    "como veian que resistia, fueron a llamar a otro elefante");
        }
    }
}
