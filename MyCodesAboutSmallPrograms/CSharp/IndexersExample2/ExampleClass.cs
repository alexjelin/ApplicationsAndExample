using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IndexersExample2
{
    internal class ExampleClass
    {
        private int[] arrayOfNumbers;

        private int this[int index]
        {
            get
            {
                if (index >= 0 && index <= arrayOfNumbers.Length - 1)
                {
                    return arrayOfNumbers[index];
                }
                else
                {
                    throw new ArgumentException("Nevaliden index e podaden za masivyt s chisla!");
                }
                ;
            }
            set
            {
                if (index >= 0 && index <= arrayOfNumbers.Length - 1)
                {
                    arrayOfNumbers[index] = value;
                }
                else
                {
                    throw new ArgumentException("Nevaliden index e podaden za masivyt s chisla!");
                }
            }
        }

        public ExampleClass(int size)
        {
            arrayOfNumbers = new int[size];
            for (int i = 0; i < arrayOfNumbers.Length; i++)
            {
                arrayOfNumbers[i] = 0;
            }
        }



        public static void Main(string[] args)
        {
            ExampleClass test = new ExampleClass(10);
            test[0] = 545;
            test[1] = 99;
            test[3] = 548;
            test[4] = 547;
            test[6] = 5455;

            for (int counter = 0; counter < test.arrayOfNumbers.Length; counter++)
            {
                Console.WriteLine("{0}", test.arrayOfNumbers[counter]);
            }
        }
    }
}

