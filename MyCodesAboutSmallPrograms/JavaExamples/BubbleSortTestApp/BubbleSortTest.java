// Fig. 7.11b: BubbleSortTest.java
// Sort an array's values into ascending order.

// Java core packages
//import java.awt.*;

// Java extension packages
import javax.swing.*;

public class BubbleSortTest{

   public static void main(String args[])
   {
      JTextArea outputArea = new JTextArea();
      
      JFrame app           = new JFrame ("BubbleSort Method");
      int array[] = { 2, 6, 4, 8, 10, 12, 89, 68, 45, 37 };

      String output = "Data items in original order\n";

      // append original array values to String output
      for ( int counter = 0; counter < array.length; counter++ )
         output += "   " + array[ counter ];
 
      sortIt.bubbleSort( array );  // sort array

      output += "\n\nData items in ascending order\n";

      // append sorted\ array values to String output
      for ( int counter = 0; counter < array.length; counter++ ) 
         output += "   " + array[ counter ];

      outputArea.setText( output );
      app.add(outputArea);
      app.setSize(250, 150);
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.setVisible(true);

   }
  }
