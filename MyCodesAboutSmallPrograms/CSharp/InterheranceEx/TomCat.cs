using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterheranceEx
{
    class TomCat:Animal
    {
        public TomCat(string name, int age, string gender) : base(age, name, gender)
        {
            
        }

        public override void soundOfAnimal()
        {
            Console.WriteLine("Mquuuuuu, az sym kotarak!");
        }
    }
}
