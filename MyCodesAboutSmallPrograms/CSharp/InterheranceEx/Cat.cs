using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterheranceEx
{
    class Cat:Animal
    {
        public Cat(int age, string name, string genger) : base(age, name, genger)
        {
            
        }

        public override void soundOfAnimal()
        {
            Console.WriteLine("Meyuuu!Az sym kotka ! :))");
        }
    }
}
