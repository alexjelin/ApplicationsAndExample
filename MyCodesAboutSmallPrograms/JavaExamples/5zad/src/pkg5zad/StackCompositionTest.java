package pkg5zad;
public class StackCompositionTest 
{
   public static void main( String args[] )
   {
      StackComposition stack = new StackComposition();  

    String someWord="wow";
    
    char[] arr1=someWord.toCharArray();
    
    for(int i=0;i<arr1.length;i++)
    {
        stack.push(arr1[i]);
    }
    
    for(int i=0;i<arr1.length;i++)
    {
       if(arr1[i]==stack.pop())
       {
           System.out.println("OK");
       }
       else
       {
           System.out.println("ne e palindrom");
           break;
       }
    }
    
    
   } // end main
} // end class StackCompositionTest



/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
