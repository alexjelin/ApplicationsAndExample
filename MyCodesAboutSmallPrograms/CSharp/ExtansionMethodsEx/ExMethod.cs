using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtansionMethodsEx
{
    public static class Example
    {
        public static void printTheText(this string text)
        {
            Console.WriteLine(text);
        }
        static void Main(string[] args)
        {
            string text = "Example String";
            text.printTheText();
        }
    }
}
