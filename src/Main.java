import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner fuck = new Scanner(System.in);

        System.out.println("Tid på dagen: 'Dag' 'Aften' 'nat'\nTid:" );
        String tid = fuck.nextLine();

        System.out.println("Trafikmængde: 'Høj' 'lav'\nTrafik:" );
        String trafik = fuck.nextLine();

        System.out.println("Områdes type: 'bolig' 'erhverv' 'blandet'\nType:" );
        String type = fuck.nextLine();

        System.out.println("Nødsituation: 'ja' 'nej'\nNød:" );
        String nød = fuck.nextLine();

        if ((tid.equals("Dag") && trafik.equals("lav")) || nød.equals("ja")){
            System.out.println("lyset er grønt");
        } else if (tid.equals("Aften") || (tid.equals("nat") && trafik.equals("lav"))){
            System.out.println("lyset er gult");
        } else if ((tid.equals("Nat") && trafik.equals("Høj")) || (trafik.equals("Høj") && type.equals("bolig"))) {
            System.out.println("lyset er rødt");
            
        }
        if (type.equals("erhverv") || (type.equals("blandet") && trafik.equals("lav"))){
            System.out.println("Adgang tilladt");
        } else if (type.equals("bolig") && tid.equals("nat")){
            System.out.println("Adgang forbudt");
            
        }

    }

    }