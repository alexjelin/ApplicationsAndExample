package zad4;

public class Zad4 {

    public static void main(String[] args) {
        String text = "Microsoft announced its next generation Java compiler today.\n"
                + "It uses advanced parser and special optimizer for the\n"
                + "Microsoft JVM.";
        String result;
        String result1;
        String result2;
        result = text.replaceAll("Microsoft", "********");
        result1 = result.replaceAll("JVM", "***");
        result2 = result1.replaceAll("Java", "****");
        System.out.printf(result2);
    }
}
