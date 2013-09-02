package test;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TestApplication {
   public static void main(String[] args) {
       JTextArea text=new JTextArea();
       JFrame app=new JFrame();
       app.add(text);
       app.setSize(300, 300);
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       app.setVisible(true);
       Scanner input=new Scanner(System.in);
       int[] array=new int[10];
       for(int i=0;i<array.length;i++){
           array[i]=input.nextInt();
       }
       Test newTest=new Test(array);
       System.out.println("Sortiran massive:Finish");
       int[] hah=newTest.bubleSort();
       System.out.println("Insert New Number:");
       int key=input.nextInt();
       newTest.linearSearch(key);
 
       for(int i=0;i<hah.length;i++){
           System.out.printf("%d \n",hah[i]);
       }
       
       System.out.printf(newTest.linearSearch(key));
       
   }
}
