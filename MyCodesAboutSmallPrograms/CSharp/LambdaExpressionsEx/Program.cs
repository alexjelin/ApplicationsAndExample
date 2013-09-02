namespace LambdaExpressionsEx
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    class Program
    {
        static void Main(string[] args)
        {
            List<string> listExample = new List<string>();
            listExample.Add("VARNA");
            listExample.Add("Ruse");
            listExample.Add("Burgas");
            listExample.Add("Strasburg");
            listExample.Add("Lozenec");
            listExample.Add("Sofia");

            var newList = listExample.FindAll(town => town.StartsWith("B"));
            foreach (var town in newList)
            {
                Console.WriteLine(town.ToString());
            }
            int counter = 0;
            List<int> listFromNumbers=new List<int>(10);
            listFromNumbers.Add(1);
            listFromNumbers.Add(2);
            listFromNumbers.Add(3);
            listFromNumbers.Add(4);
            listFromNumbers.Add(5);

            var listOfNUmbers = listFromNumbers.FindAll(x => x < 3);
            foreach (var num in listOfNUmbers)
            {
                Console.Write(" "+num.ToString());
            }
        }
    }
}
