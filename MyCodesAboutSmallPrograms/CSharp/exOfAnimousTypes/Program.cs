using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exOfAnimousTypes
{
    class Program
    {
        static void Main(string[] args)
        {
            var cars = new {Color = "Red", Price = "55800", Year = "1998"};
            Console.WriteLine("Cars color is {0} ! ",cars.Color);
            Console.WriteLine("Price of car is {0} ! ",cars.Price);

            var myCat =
                new
                    {
                        Name = "Sasi",
                        Color = "Grey",
                        Year = "2008",
                        Age = "5 Years old",
                        Description = "SHe is very swetty!"
                    };

            Console.WriteLine("My cat is called {0}!She is {1}!Her color is {2} ! {3}",myCat.Name,myCat.Age,myCat.Color,myCat.Description);

        }
    }
}
