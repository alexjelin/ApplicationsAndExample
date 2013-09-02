namespace LINQ3
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
            string[] array = {"Varna", "Burgas", "Sofia", "Ruse", "SIlistra", "Dobrich"};
            var queryArray =
                from town in array
                where town.StartsWith("S")
                select town;

            foreach (var town in queryArray)
            {
                Console.WriteLine(" "+town.ToString());
            }

        }
    }
}
