
package homework13;

public class Test {
   public static void main(String args[]){
       Point cord1=new Point(2, 7);
       Point cord2=new Point(1, 6);
       Rectangle test=new Rectangle(cord1, cord2);
       
       // izvejdam korditenatite parvo s ToString na Point obektite;
       System.out.printf("%s\n",cord1.toString());
       System.out.printf("%s",cord2.toString());
        System.out.printf("%s",test.toString());
       
   }
}
