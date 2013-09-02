using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQEx
{
    internal class LINQ
    {
        private static void Main(string[] args)
        {
            Random rand = new Random();
            int[] numbers = new int[10];
            for (int counter = 0; counter < numbers.Length;counter++)
            {
                numbers[counter] = rand.Next(10, 50);
                Console.Write("{0} ",numbers[counter]);
            }

            var queryNumbers =
                from number in numbers
                where
                    number > 20
                select number;
            Console.WriteLine();
            Console.WriteLine("Cislata po golemi ot 20 sa : ");
            foreach (var nums in queryNumbers)
            {
                Console.Write(nums.ToString()+" ");
            }

        }
    }
}
