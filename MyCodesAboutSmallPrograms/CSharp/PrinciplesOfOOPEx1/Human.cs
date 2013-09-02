using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrinciplesOfOOPEx1
{
     public class Human
    {
        private string firstName;
        private string lastName;

        public string FirstName
        {
            set { this.firstName = firstName; }
            get { return this.firstName; }
        }

        public string LastName
        {
            set { this.lastName = lastName; }
            get { return this.lastName; }
        }

        public Human(string newFirstName, string newLastName)
        {
            this.firstName = newFirstName;
            this.lastName = newLastName;
        }

        public string toString()
        {
            string result = string.Format("Parvo ime : {0} \t Posledno ime: {1}", firstName, lastName);
            return result;
        }
    }

}
