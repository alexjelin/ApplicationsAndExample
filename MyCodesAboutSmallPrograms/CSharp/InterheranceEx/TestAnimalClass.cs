using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterheranceEx
{
    class TestAnimalClass
    {
        static void Main(string[] args)
        {
            Cat caat=new Cat(12,"Lora","Female");
            Dog dog=new Dog(12,"Charli","Male");
            Frog frog=new Frog(1,"Mariq","Female");
            Kitten kitten=new Kitten(2,"Djons","Male");
            TomCat cat=new TomCat("Petko",55,"Male");

            caat.toString();
            caat.soundOfAnimal();
            Console.WriteLine();
            dog.toString();
            dog.soundOfAnimal();
            Console.WriteLine();
            frog.toString();
            frog.soundOfAnimal();
            Console.WriteLine();
            kitten.toString();
            kitten.soundOfAnimal();
            Console.WriteLine();
            cat.toString();
            cat.soundOfAnimal();


        }
    }
}
