/*
 * konzolno prilojenie za generirane na sluchaino saobshtenie ot potribetel
 * za komentar naprimer;
 */
package genericrandommessage;

import java.util.Random;

public class GenericRandomMessage {

    public static void main(String[] args) {
        Random rand = new Random();

        String[] fraza = new String[5];
        fraza[0] = "Produktyt e otlichen";
        fraza[1] = "Tova e Strahoten produkt";
        fraza[2] = "Postoqnno polzam toq produkt";
        fraza[3] = "Tova e dobr produkt";
        fraza[4] = "Haresa mi produkta";

        int fraza1 = rand.nextInt(fraza.length);
        String frazaResult;
        for (int i = 0; i < fraza.length; i++) {
            if (fraza1 == i) {
                frazaResult = fraza[i];
                System.out.printf("%s", frazaResult);
            }
        }

        String[] sluchki = new String[5];
        fraza[0] = "Vinagi mi e pomagal";
        fraza[1] = "Nqmali sme problemi s nego.";
        fraza[2] = "Provvaite go navsqkade!";
        fraza[3] = "Ami kakvo da vi kaja..vzamete si go!";
        fraza[4] = "Let's bay nigga!";

        int sluchka = rand.nextInt(sluchki.length);
        for (int k = 0; k < sluchki.length; k++) {
            String sluchkaResult;
            sluchkaResult = sluchki[k];
            System.out.printf("- %s", sluchkaResult);

        }

        String[] parvoimeAvtor = new String[5];
        fraza[0] = "Ivan";
        fraza[1] = "Penka";
        fraza[2] = "Dragan";
        fraza[3] = "Bai pesho";
        fraza[4] = "Bai Ivan";

        int parvoIme = rand.nextInt(parvoimeAvtor.length);
        String parvoimeResult;
        for (int i = 0; i < parvoimeAvtor.length; i++) {
            if (parvoIme == i) {
                parvoimeResult = parvoimeAvtor[i];
                System.out.printf("%s", parvoimeResult);
            }
        }

        String[] vtoroimeAvtor = new String[5];
        fraza[0] = "Ivanovski";
        fraza[1] = "Bandalovski";
        fraza[2] = "Rqpovski";
        fraza[3] = "Drunchovki";
        fraza[4] = "Petkanski";

        int vtoroIme = rand.nextInt(vtoroimeAvtor.length);
        String vtoroImeResult = null;
        for (int i = 0; i < vtoroimeAvtor.length; i++) {
            if (vtoroIme == i) {
                vtoroImeResult = vtoroimeAvtor[i];
            }
        }

        String[] grad = new String[5];
        fraza[0] = "Sofiq";
        fraza[1] = "Plovdim";
        fraza[2] = "varna";
        fraza[3] = "burgas";
        fraza[4] = "Sozopol";



        int grad1 = rand.nextInt(grad.length);
        String gradResult = null;
        for (int j = 0; j < grad.length; j++) {
            if (grad1 == j) {
                gradResult = grad[j];
            }
        }
    }
}
