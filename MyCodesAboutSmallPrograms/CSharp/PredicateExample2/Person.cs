using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PredicateExample2
{
    internal class Person
    {
        private string firstName;
        private string lastName;

        public string FirstName
        {
            get { return firstName; }
            set { firstName = value; }
        }

        public string LastName
        {
            get { return lastName; }
            set { lastName = value; }
        }

        public Pesron(string newFirstName, string newLastName)
        {
            this.FirstName = newFirstName;
            this.lastName = newLastName;
        }

        public Person() : this(null, null)
        {

        }

        public string toString()
        {
            string result;
            result = string.Format("Imena na choveka: {0} {1}", firstName, lastName);
            return result;
        }

        private static void Main(string[] args)
        {
            Person ivan = new Person("Ivan", "Petrov");
            Person sasho = new Person("Sasho", "Petrov");
            Person kiril = new Person("Kiril", "Petrov");
            Person koldjan = new Person("Koldjan", "Petrov");
            Person alex = new Person("Alex", "Petrov");

            List<Person> humans = new List<Person>();
            humans.Add(ivan);
            humans.Add(sasho);
            humans.Add(kiril);
            humans.Add(koldjan);
            humans.Add(alex);

            Predicate<Person> finderPerson = (Person p) => {
                                                               return p.FirstName.StartsWith("K");
            };

            humans.Find(finderPerson);

        }
    }
}
