using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQEX2
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array=new int[25];
            for (int i = 0; i < array.Length; i++)
            {
                array[i] = i;
                Console.WriteLine(array[i].ToString()+" ");
            }

            var queryNumbers =
                from num in array
                where num >= 10
                select num;
            Console.WriteLine("Chislata nad 10 sa:");
            foreach (var queryNumber in queryNumbers)
            {
                Console.WriteLine(queryNumber.ToString());   
            }

        }
    }
}
