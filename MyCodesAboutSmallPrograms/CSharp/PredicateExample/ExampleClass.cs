using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PredicateExample
{
    internal class ExampleClass
    {
        private string name;
        private int age;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        public ExampleClass(string newName, int newAge)
        {
            this.name = newName;
            this.age = newAge;
        }

        public ExampleClass()
            : this("-", 0)
        {

        }

        private static void Main(string[] args)
        {
            ExampleClass testObj0 = new ExampleClass("Ivan", 34);
            ExampleClass testObj1 = new ExampleClass("Pesho", 38);
            ExampleClass testObj2 = new ExampleClass("Sasho", 32);
            ExampleClass testObj3 = new ExampleClass("Borko", 31);

            List<ExampleClass> testList = new List<ExampleClass>();
            testList.Add(testObj0);
            testList.Add(testObj1);
            testList.Add(testObj2);
            testList.Add(testObj3);
            Predicate<ExampleClass> finderIvan = (ExampleClass e) => { return e.Name == "Ivan"; };
            ExampleClass ivan = testList.Find(finderIvan);
        }
    }
}
