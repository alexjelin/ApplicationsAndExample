package gas;

public class TestForApp {

    public static void main(String args[]) {
        Gas[] mixture = new Gas[10];

        for (int i=0;i<mixture.length;i++) {
            mixture[i]=new Gas(String.format("Gas %d", i), i);
        }
         AirMearusment air=new AirMearusment(mixture);
         air.sort();
         String text=air.toString();
         System.out.printf("%s",text);
    }
}
