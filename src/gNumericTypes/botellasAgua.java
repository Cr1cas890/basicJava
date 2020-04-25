package gNumericTypes;

import libs.Input;

public class botellasAgua
    {

    public static void main(String[] args)
        {
        int i;
        System.out.println("Cuantos minutos te tardas?");
        i = Input.get_int();


        while (i <= 0)
        {
            System.out.print("Dame un numero correcto: ");
            i = Input.get_int();
        }

        int botellasAgua = 12;
            int totalDeBotellas = i * botellasAgua;
            System.out.println("Total de botellas desperdiciadas por" + " " + i + " " + "minutos" + "=" + " " + totalDeBotellas);
        }

    }
