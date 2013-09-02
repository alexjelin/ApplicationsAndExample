//konzolno prilojenie za sazdavane na dumi ot glavni bukvi;
package zad3;

public class Zad3 {

    public static void main(String[] args) {
        String text = "We are living in a <upcase>yellow submarine</upcase>. We\n"
                + "don't have <upcase>anything</upcase> else.\n";
        String result;
        
        result=text.replaceAll("<upcase>yellow submarine</upcase>","YEALLOW SUBMARINE");
        
        String newResult=result.replaceAll("<upcase>anything</upcase>", "ANYTHING");
        System.out.printf(newResult);
        
    }
}
