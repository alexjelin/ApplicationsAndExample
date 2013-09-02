using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
System.IComparable;

namespace PrinciplesOfOOPEx1
{
    internal class Student : Human
    {
        private int greed;

        public void setGreed(int newGreed)
        {
            if (newGreed >= 2 && newGreed <= 6)
            {
                this.greed = newGreed;
            }
            else
            {
                throw new ArgumentOutOfRangeException("Ocenkata trqbva da e ot 2 do 6 !");
            }
        }

        public int getGreed()
        {
            return this.greed;
        }

        public Student(string fName, string lName, int greed)
            : base(fName, lName)
        {
            this.greed = greed;
        }

        public void sortStudentsByTheirGreeds()
        {
            Student[] students = new Student[10];

            students.OrderBy(student => getGreed());
            Console.WriteLine("Sortiran masivat izlgejda taka:");
            Console.WriteLine();
            for (int counter = 0; counter < students.Length; counter++)
            {
                Console.WriteLine("{0}", students[counter]);
            }
        }
    }
}
