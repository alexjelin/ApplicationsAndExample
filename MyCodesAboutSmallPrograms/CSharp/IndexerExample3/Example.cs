
namespace IndexerExample3
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    internal class Example
    {
        public double[] array;

        public Example(int size)
        {
            array = new double[size];
            for (int j = 0; j < array.Length; j++)
            {
                array[j] = 0.0;
            }
        }

        public double this[int index]
        {
            get
            {
                if (index >= 0 && index <= array.Length - 1)
                {
                    return array[index];
                }
                else
                {
                    throw new ArgumentException("Nevaliden index e podaden za masivyt s chisla!");
                }
                ;
            }
            set
            {
                if (index >= 0 && index <= array.Length - 1)
                {
                    array[index] = value;
                }
                else
                {
                    throw new ArgumentException("Nevaliden index e podaden za masivyt s chisla!");
                }
                ;
            }
        }

        // krain na indexatora;

        public static void Main(string[] args)
        {
            Example testObj=new Example(7);
            testObj[0] = 4.55;
            testObj[1] = 44.8;
            testObj[5] = 8.5;

            for (int i = 0; i < testObj.array.Length; i++)
            {
                Console.WriteLine("{0}",testObj.array[i]);
            }
        }
    }
}
