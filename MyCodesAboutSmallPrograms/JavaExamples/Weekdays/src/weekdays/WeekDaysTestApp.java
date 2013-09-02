package weekdays;

import java.util.EnumSet;
import java.util.Random;
// Programata e testvana pri primera i raboti korektno!
public class WeekDaysTestApp {

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Dnite na sedmicata sa!");

        String[] arrayOfDays = new String[7];
        arrayOfDays[0] = Weekdays.MON.getTitleOfDay();
        arrayOfDays[1] = Weekdays.TUE.getTitleOfDay();
        arrayOfDays[2] = Weekdays.WED.getTitleOfDay();
        arrayOfDays[3] = Weekdays.THU.getTitleOfDay();
        arrayOfDays[4] = Weekdays.FRI.getTitleOfDay();
        arrayOfDays[5] = Weekdays.SAT.getTitleOfDay();
        arrayOfDays[6] = Weekdays.SUN.getTitleOfDay();
        int randomNumber = rand.nextInt(7)+1;
        
// cikyl za izpisvane na dnite ot sedmicata s palnite im imena za po dobra naglednost
        for (int i = 0; i < arrayOfDays.length; i++) {
            System.out.printf("%s", arrayOfDays[i]);
        }

        System.out.println("\n Sega shte se generira sluchaino nachalo na niz ot dnite"
                + "za sedmicata podred!");
        String result = "";

        for (int i = randomNumber-1; i < arrayOfDays.length; i++) {
            result += String.format("%s ", arrayOfDays[i]);
        }
        String lastResult = "";
        for (int i = 0; i < randomNumber-1; i++) {
            lastResult += String.format("%s ", arrayOfDays[i]);
        }

        System.out.printf("%s %s ", result, lastResult);

        String[] arrayOfDays2 = new String[7];
        arrayOfDays2[0] = Weekdays.MON.getTitleOfDay2();
        arrayOfDays2[1] = Weekdays.TUE.getTitleOfDay2();
        arrayOfDays2[2] = Weekdays.WED.getTitleOfDay2();
        arrayOfDays2[3] = Weekdays.THU.getTitleOfDay2();
        arrayOfDays2[4] = Weekdays.FRI.getTitleOfDay2();
        arrayOfDays2[5] = Weekdays.SAT.getTitleOfDay2();
        arrayOfDays2[6] = Weekdays.SUN.getTitleOfDay2();
        
        String lastResult2 = "";
        for (int i = randomNumber-1; i >= 0; i--) {
            lastResult2+= String.format("%s ", arrayOfDays2[i]);
        }
        
        String result2 = "";
        for (int i = arrayOfDays2.length-randomNumber+1; i >1; i--) {
            result2+= String.format("%s ", arrayOfDays2[i]);
        }

        System.out.printf("%s %s ", lastResult2,result2);
    }
}
