using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegatEx4
{
    public delegate void fintTheElementByLinearSearch(int element);

    class Program
    {
        public int[] arrayNumber;

        public void setArrayNumber(int[] newArray)
        {
            int[] arrayNumber=new int[newArray.Length];
            for (int counter = 0; counter < arrayNumber.Length; couter++)
            {
                arrayNumber[i] = newArray[i];
            }
        }

        public int[] getArrayNumber()
        {
            int[] copy = new int[arrayNumber.Length];
            for (int i = 0; i < arrayNumber.Length; i++)
            {
                copy[i] = arrayNumber[i];
            }

            return copy;
        }
        public void linearSearchByElement(int element)
        {
            for (int k = 0; k < arrayNumber.Length; k++)
            {
                if (element == arrayNumber[k])
                {
                    Console.WriteLine("Elementyt e otkrit v index {0} !",k);
                    break;
                }
            }
        }

        public Program(int[] arrayOfNumbers)
        {
            setArrayNumber(arrayOfNumbers);
        }

        static void Main(string[] args)
        {
            int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Program test1=new Program(arrayNumbers);
            int element = 10;
            fintTheElementByLinearSearch test=new fintTheElementByLinearSearch(test1.linearSearchByElement);
            test(arrayNumbers(element));
        }
    }
}
