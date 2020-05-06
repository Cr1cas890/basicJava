package aPseudocodigo.cPseudoCodigoCiclos;

import java. util. Date;

public class Netflix {

    public static void main(String[] args) {

        int dinero = 1000;
        boolean coronavirus = true;
        int fechaHoy = 31;
        int fechavigencia = 1;


        if (dinero >= 2000) {
            System.out.println("ir al cine");
        }else if(fechaHoy < fechavigencia){
            System.out.println("NetFlix");
        }else if(coronavirus=true){
            System.out.println("usar cubrebocas");
        }else{
            System.out.println("Quedate en casa");
        }
    }
}
