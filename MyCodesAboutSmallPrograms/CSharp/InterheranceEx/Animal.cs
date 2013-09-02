using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterheranceEx
{
    class Animal
    {
        private int age;
        private string name;
        private string gender;


        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public string Gender
        {
            get { return gender; }
            set { gender = value; }
        }

        public Animal(int newAge, string newName, string newGender)
        {
            this.age = newAge;
            this.name = newName;
            this.gender = newGender;
        }

        public void toString()
        {
            string result;
            result = string.Format("Ime na jivotonoto: {0} \n Vazrast : {1} \n Pol : {2}", name, age, gender);
            Console.WriteLine(result);
        }

        public virtual void soundOfAnimal()
        {
            
        }
    }
}
