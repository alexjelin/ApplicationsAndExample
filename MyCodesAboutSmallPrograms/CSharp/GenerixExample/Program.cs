using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GenerixExample
{
    class Program
    {
        public class printTheNumbers<T>
        {
            public void print(T element1, T element2)
            {
                Console.WriteLine("{0} , {1} ",element1,element2);
            }
        }

        static void Main(String[] args)
        {
            int number = 1;
            int number2 = 2;
            printTheNumbers<int> test=new printTheNumbers<int>();
            test.print(number,number2);
        }
    }
}
