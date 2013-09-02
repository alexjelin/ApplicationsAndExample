using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterheranceEx
{
    class Kitten:Animal
    {
        public Kitten(int age, string name, string gender):base(age,name,gender)
        {
            
        }

        public override void soundOfAnimal()
        {
            Console.WriteLine("Az sym kotence!Mquuu");
        }
    }
}
