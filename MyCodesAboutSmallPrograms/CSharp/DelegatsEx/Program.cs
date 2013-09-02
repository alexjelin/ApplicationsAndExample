using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegatsEx
{
    public delegate void printText(string text);

    class Program
    {
        public static void printLogo(string text)
        {
            Console.WriteLine(text);
        }

        static void Main(string[] args)
        {
            string text = "Example";
            printText d=new printText(printLogo);
            d("test");
        }
    }
}
