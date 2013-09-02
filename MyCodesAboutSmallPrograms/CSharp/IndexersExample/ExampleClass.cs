using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IndexersExample
{
    internal class ExampleClass
    {
        private string[] array;

        public string this[int index]
        {
            get { return array[index]; }
            set { this.array[index] = value; }
        }

        public ExampleClass(int size)
        {

            array = new string[size];

            for (int i = 0; i < size; i++)
            {
                array[i] = "empty";
            }
        }

        private static void Main(string[] args)
        {
            ExampleClass testObj = new ExampleClass(10);
            testObj[0] = "Ivan";
            testObj[1] = "Branimir";
            testObj[2] = "Stoqn";
            testObj[3] = "Alex";
            testObj[4] = "Hondaa";

            for (int i = 0; i < testObj.array.Length; i++)
            {
                Console.WriteLine("{0}", testObj.array[i]);
            }
        }
    }
}
