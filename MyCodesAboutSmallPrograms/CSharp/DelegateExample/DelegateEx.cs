using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateExample
{
    public delegate void printSameThing(string someText);

    internal class DelegateEx
    {
        public void PrintMessage(string text)
        {
            Console.WriteLine(text);
        }

        public void printMessage2(string text2)
        {
            Console.WriteLine(text2);
        }

        private static void Main(string[] args)
        {
            string text = "Hello!";
            string text2 = "Bye!";
            DelegateEx e = new DelegateEx();
            printSameThing exampleDelegate = new printSameThing(e.PrintMessage);
            exampleDelegate(text);
            exampleDelegate += e.printMessage2;
            exampleDelegate(text2);
        }
    }
}
